package com.occamsrazor.web.user;

public interface UserService {

	public int count();

	public void add(User user);

	public User login(User user);
	public User detail(String userid);
		
}
