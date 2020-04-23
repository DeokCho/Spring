package com.occamsrazor.web.sns;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.occamsrazor.web.uitl.Messenger;

@Service
public class SnsServiceImpl implements SnsService{
	private Map<String, Object> map;
	
	public SnsServiceImpl() {
		map = new HashMap<>();
	}

	@Override
	public void add(Sns sns) {
		map.put(sns.getUserId(), sns);
	}

	@Override
	public int count() {
		return map.size();
	}

	@Override
	public void login(Sns sns) {
	
		
	}
	
	
	
}
