package com.onlineShop.example.usermanagement;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.onlineShop.example.shopEntity.TbOsUserEntity;
import com.onlineShop.example.shopPersistance.TbOsUSerPersistance;

@Service
public class LoginService implements UserDetailsService {
	
	@Autowired
	private TbOsUSerPersistance userPersistance;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	private static final String NotFound = "User Not Found With : ";
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		TbOsUserEntity entity = null;
		
		try
		{
			entity = userPersistance.findByRefId(username).get();
		}
		catch(Exception ex)
		{
			throw new UsernameNotFoundException(NotFound+username);
		}
		
		String userId = null;
		String password = null;
		
		if(entity.getRefId() != null && entity.getPswd() != null)
		{
			
			userId = entity.getRefId();
			password = entity.getPswd();
			if(entity.getRefId().equals(username))
			{
				return new User(userId, passwordEncoder.encode(password), new ArrayList<>());
			}
			else
			{
				throw new UsernameNotFoundException(NotFound+username);
			}
		}
		else
		{
			throw new UsernameNotFoundException(NotFound+username);
		}
		
	}
	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		if(username.equals("sharik"))
//		{
//			return new User("sharik","sharik123", new ArrayList<>());
//		}
//		else
//		{
//			throw new UsernameNotFoundException("User not found ! ");
//		}
//	}

}
