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
	public User detail(String userid) {
		System.out.println("아이디 왔니? "+userid);
		User t = (User) map.get(userid);
		System.out.println("=================> "+ t);
		return t;
	}
}