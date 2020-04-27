package com.occamsrazor.web.sns;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SnsServiceImpl implements SnsService {
	private Map<String, Object> map;
	
	public SnsServiceImpl() {
		map = new HashMap<>();
	}
	@Override
	public void add(Sns sns) {
		map.put(sns.getUserid(), sns);
	}
	@Override
	public int count() {
		return map.size();
	}
	@Override
	public Sns login(Sns sns) {
		Sns returnSns = null;
		if(map.containsKey(sns.getUserid())) {
			Sns s = detail(sns.getUserid());
			if(sns.getPasswd().equals(s.getPasswd())) {
				returnSns = s;
			}
		}
		return returnSns;
	}
	@Override
	public Sns detail(String userid) {
		return (Sns) map.get(userid);
	}
	
}
