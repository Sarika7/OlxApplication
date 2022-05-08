package com.zensar.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.entity.LoginUser;

public interface LoginService {
	
	List<LoginUser> getAllUsers(String username, String password);
	
	LoginUser registerUser( LoginUser user); 
		
	
	boolean logoutUser( long id1, String username, String password);
	
	String loginUser(@RequestBody LoginUser user );
}

