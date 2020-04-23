package com.occamsrazor.web.user;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	private User[] users;
	private int count;
	
	public UserServiceImpl() {
		users = new User[5];
		count=0;
	}
}
