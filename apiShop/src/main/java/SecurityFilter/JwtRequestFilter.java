package SecurityFilter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.filter.OncePerRequestFilter;

import com.jpa.test.commonUtilMethods.CommonConstant;
import com.jpa.test.loggingShopLogging.ILogger;
import com.jpa.test.loggingShopLogging.LoggerContext;
import com.jpa.test.loggingShopLogging.LoggerFactory;


import Usermanagement.LoginService;
import io.jsonwebtoken.ExpiredJwtException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

	private static final ILogger LOGGER = LoggerFactory.getLogger(JwtRequestFilter.class);

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private LoginService loginService;

	@CrossOrigin
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setHeader("Access-Control-Request-Headers",
				"authtoken,Content-Type, Content-Length, X-Requested-With,userId,bankKey,bankId,systemId,cmpnyNm,cmpnyId,sessionUniqueId,SELECTED_APP");
		response.setHeader("Access-Control-Allow-Headers",
				"authtoken,Content-Type, Content-Length, X-Requested-With,userId,bankKey,bankId,systemId,cmpnyNm,cmpnyId,sessionUniqueId,SELECTED_APP");
		response.setHeader("Access-Control-Allow-origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET, POST, DELETE");

		final String requestTokenHeader = request.getHeader(CommonConstant.AUTH_TKN_KEY);

		String username = null;
		String jwtToken = null;

		if (requestTokenHeader != null) {
			jwtToken = requestTokenHeader;
			try {
				username = jwtTokenUtil.getUsernameFromToken(jwtToken);
			} catch (final IllegalArgumentException e) {
				LOGGER.error("Unable to get JWT Token" + e.getMessage(), e);
			} catch (final ExpiredJwtException e) {
				LOGGER.error("JWT Token has expired" + e.getMessage(), e);
			}
		} else {
			LOGGER.warn("JWT Token does not present in the Header");
		}

		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {

			final UserDetails userDetails = this.loginService.loadUserByUsername(username);

			if (jwtTokenUtil.validateToken(jwtToken, userDetails)) {

				final UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				usernamePasswordAuthenticationToken
						.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			} else {
				final UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				usernamePasswordAuthenticationToken
						.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				usernamePasswordAuthenticationToken.setAuthenticated(false);
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}

		}
		LoggerContext.setUserId(username);

		LOGGER.info("START :: Accessed API {} ", request.getServletPath());

		filterChain.doFilter(request, response);

		LOGGER.info("END :: Served API {} ", request.getServletPath());
	}

}
