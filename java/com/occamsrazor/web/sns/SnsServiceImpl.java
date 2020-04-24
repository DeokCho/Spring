package com.occamsrazor.web.sns;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SnsServiceImpl {
	Map<String, Object> map;
	
	public SnsServiceImpl() {
		map = new HashMap<>();
	}
	
	public boolean join(Sns sns) {
		return false;
	}
	
	public Sns detail(String userid) {
		return (Sns) map.get(userid);
		
	}
}
