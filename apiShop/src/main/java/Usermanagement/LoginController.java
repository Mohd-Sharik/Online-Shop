package Usermanagement;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.SecurityUtility.SecurityHelper.MessageDiagestUtil;
import com.jpa.test.commonUtilMethods.CommonConstant;
import com.jpa.test.loggingShopLogging.ILogger;
import com.jpa.test.loggingShopLogging.LoggerFactory;
import com.jpa.test.shopEntity.TbOsUserEntity;
import com.jpa.test.shopService.TbOsDbErrService;
import com.jpa.test.shopService.TbOsUserService;
import com.sun.xml.messaging.saaj.packaging.mime.internet.ParseException;

import SecurityFilter.JwtTokenUtil;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import userModel.LoginResponce;
import userModel.Loginrequest;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

	private static final ILogger LOG = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private LoginService loginService;

	@Autowired
	private TbOsDbErrService dbErrService;

	@Autowired
	private TbOsUserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;

	public LoginResponce getLoginCredential(@RequestBody Loginrequest loginRequest, HttpServletRequest request)
			throws ParseException, NoSuchAlgorithmException {
		LoginResponce loginResponse = new LoginResponce();

		String userId = loginRequest.getUsername();
		String sessionId = request.getHeader(CommonConstant.SESSION_ID);
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
			loginResponse.setDsplNm(user.getDsplNm());
			final UserDetails userDetail = loginService.loadUserByUsername(userId);
			String authTocken = jwtTokenUtil.generateToken(userDetail);
			loginResponse.setAuthToken(authTocken);
			loginResponse.setIsAuthUser(true);
			loginResponse.setPassCrtBy(user.getPswdCrtBy());
			
		} catch (Exception e) {
			// TODO: handle exception
			LOG.error("Exception Occure during login time : ",request.getServletPath(), e);
			
			loginResponse.setErrorMessage(e.getMessage());
			return loginResponse;
			
		}

		return loginResponse;
	}

}
