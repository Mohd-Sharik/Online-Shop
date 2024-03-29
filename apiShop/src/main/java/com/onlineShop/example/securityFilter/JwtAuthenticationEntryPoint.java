package com.onlineShop.example.securityFilter;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;


/*this class is entry point of jwt token security if somebody enter a wrong username and password 
 * then it will return bed news/response to user's
*/
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint,Serializable {
	
	private static final long serialVersionUID = -7858869558953243875L;

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().write("INVALID_AWT_TOKEN");
		
	}

}
