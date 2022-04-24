package com.zensar.service;

import java.util.ArrayList;
import java.util.List;

import com.zensar.entity.User;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

	static List<User> users=new ArrayList<User>();
	
	static {
		users.add(new User(1L, "Anand", "Kulkarni", "anand", "anand123", "anand@gmail.com", 12345));
		
	}

	@Override
	public List<User> getAllUsers(String username, String password) {
		if(username.equals("anand")&&password.equals("anand123")) {
			return users;
			}
		return users;
	}

	@Override
	public User registerUser(User user) {
            users.add(user);
		
		return user;
	}

	@Override
	public boolean logoutUser(long id1, String username, String password) {

		if(username.equals("anand")&&password.equals("anand123")) {
			for(User user:users) {
				if(user.getId()==id1) {
					users.remove(user);
					
					
					return true;
				}
				
			}
			
		}
		return false;
	}

	@Override
	public String loginUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
