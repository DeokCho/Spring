package com.occamsrazor.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	private Map<String, Object> map;

	public UserServiceImpl() {
		map = new HashMap<>();
	}
	@Override
	public void add(User user) {
		map.put(user.getUserId(), user);
	}
	@Override
	public int count() {
		return map.size();
	}
	@Override
	public User login(User user) {
		User returnUser = null;
		if(map.containsKey (user.getUserId())) {
			User u = detail(user.getUserId());
			if(user.getPasswd().equals(u.getPasswd())){
				returnUser = u;
			}
		}		
		return returnUser;
	}
	@Override
	public User detail(String userId) {
		return (User) map.get(userId);
	}
	@Override
	public boolean update(User user) {
		map.replace(user.getUserId(), user);
		return true;
	}
	@Override
	public boolean remove(String userId) {
		map.remove(userId);
		return true;
	}
}