package com.jpa.test.usermanagement;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.SecurityUtility.SecurityHelper.MessageDiagestUtil;
import com.jpa.test.commonUtilMethods.CommonConstant;
import com.jpa.test.loggingShopLogging.ILogger;
import com.jpa.test.loggingShopLogging.LoggerFactory;
import com.jpa.test.shopEntity.TbOsUserEntity;
import com.jpa.test.shopService.TbOsDbErrService;
import com.jpa.test.shopService.TbOsUserService;
import com.jpa.test.userModel.LoginResponce;
import com.jpa.test.userModel.Loginrequest;
import com.jps.test.securityFilter.JwtTokenUtil;
import com.sun.xml.messaging.saaj.packaging.mime.internet.ParseException;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

	private static final ILogger LOG = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private LoginService loginService;

//	@Autowired
//	private TbOsDbErrService dbErrService;

	@Autowired
	private TbOsUserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;

	
	@CrossOrigin
	@RequestMapping(value = "/do", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public LoginResponce getLoginCredential(@RequestBody Loginrequest loginRequest, HttpServletRequest request)
			throws ParseException, NoSuchAlgorithmException {
		
//		
//		try
//		{
//			String username = loginRequest.getUsername();
//			String password = loginRequest.getPassword();
//			
//			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		
		
		
		LoginResponce loginResponse = new LoginResponce();

		String userId = loginRequest.getUsername();
		//String sessionId = request.getHeader(CommonConstant.SESSION_ID);
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
//			ex.printStackTrace();
//			throw new Exception("Bad credintial ! ");
			
			loginResponse.setErrorMessage(e.getMessage());
			return loginResponse;
			
		}

		return loginResponse;
		
//		 UserDetails userdetai = this.loginService.loadUserByUsername(loginRequest.getUsername());
//		 String token = this.jwtTokenUtil.generateToken(userdetai);
//		 
//		 return ResponseEntity.ok(new LoginResponce(token));
		 
	}
	
	
	private void authenticate(String username, String password) {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			
		} catch (Exception e) {
			LOG.error("Error in authenticate {} ", e.getCause());
			
		}
	}

}