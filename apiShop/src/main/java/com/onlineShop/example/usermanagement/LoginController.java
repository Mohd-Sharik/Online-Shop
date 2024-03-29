package com.onlineShop.example.usermanagement;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineShop.example.SecurityUtility.SecurityHelper.MessageDiagestUtil;
import com.onlineShop.example.loggingShopLogging.ILogger;
import com.onlineShop.example.loggingShopLogging.LoggerFactory;
import com.onlineShop.example.model.LoginResponce;
import com.onlineShop.example.model.LoginRequest;
import com.onlineShop.example.service.TbOsDbErrService;
import com.onlineShop.example.service.TbOsUserService;
import com.onlineShop.example.shopEntity.TbOsUserEntity;
import com.onlineShop.example.util.JwtTokenUtil;
import com.sun.xml.messaging.saaj.packaging.mime.internet.ParseException;


@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

	private static final ILogger LOG = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	//@Autowired
	//private LoginService loginService;
//	@Autowired
//	private TbOsDbErrService dbErrService;
	//@Autowired
	//private TbOsUserService userService;
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserDetailsService jwtInMemoryUserDetailsService;

	
	@CrossOrigin
	@RequestMapping(value = "/do", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public LoginResponce getLoginCredential(@RequestBody LoginRequest loginRequest, HttpServletRequest request)
			throws ParseException, NoSuchAlgorithmException {

    LoginResponce log = new LoginResponce();
	String userId = loginRequest.getUsername();
	String hasInput = userId + loginRequest.getPassword();
	String password = "";
	
	password = MessageDiagestUtil.getHash(hasInput);
	authenticate(userId, password);

	final UserDetails userDetails = jwtInMemoryUserDetailsService.loadUserByUsername(userId);
	final String token =  jwtTokenUtil.generateToken(userDetails);
	log.setAuthToken(token);
	
	return log;
	
	
	
	
		
		/*LoginResponce loginResponse = new LoginResponce();
		String userId = loginRequest.getUsername();  
		
		try {
			TbOsUserEntity user = userService.findByRefId(userId);

			if (user == null) {
				loginResponse.setErrorMessage("User not found : ");
				loginResponse.setIsAuthUser(false);
				return loginResponse;
			} else if (user != null && !StringUtils.equals(
					MessageDiagestUtil.getHash(loginRequest.getUsername() + loginRequest.getPassword()),
					user.getPswd())) {
				
				loginResponse.setErrorMessage("Password is incorrect please try again : ");
				loginResponse.setIsAuthUser(false);
				return loginResponse;
			}
			
			String hasInput = userId + loginRequest.getPassword();
			String password = "";
			
			password = MessageDiagestUtil.getHash(hasInput);
			authenticate(userId, password);
			
			loginResponse.setDsplNm(user.getDsplNm());
			final UserDetails userDetail = loginService.loadUserByUsername(userId);
			String authTocken = jwtTokenUtil.generateToken(userDetail);
			loginResponse.setAuthToken(authTocken);
			loginResponse.setIsAuthUser(true);
			loginResponse.setPassCrtBy(user.getPswdCrtBy());
			
		} catch (UsernameNotFoundException e) {
			LOG.error("Exception Occure during login time : ",request.getServletPath(), e);
			
			loginResponse.setErrorMessage(e.getMessage());
			return loginResponse;
			
		}

		return loginResponse;*/
	}
	
	
	private void authenticate(String username, String password) {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			
		} catch (Exception e) {
			LOG.error("Error in authenticate {} ", e.getCause());
			
		}
	}

}
