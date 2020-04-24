package com.occamsrazor.web.user;

public interface UserService {

	public int count();

	public void add(User user);

	public User login(User user);
	public User detail(String userid);

	public boolean update(User user);

	public boolean remove(String userid);
		
}
