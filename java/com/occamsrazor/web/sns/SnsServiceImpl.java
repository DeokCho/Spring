package com.occamsrazor.web.sns;

import java.util.HashMap;
import java.util.Map;

import javax.xml.soap.Detail;

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
	public Sns login(Sns sns) {
		Sns returnSns = null;
		if(map.containsKey(sns.getUserId())) {
			Sns s = Detail(sns.getUserId());
			if(sns.getPasswd().equals(s.getPasswd())) {
				returnSns = s;
			}
		}
		return sns;
	}

	private Sns Detail(String userId) {
		return (Sns) map.get(userId);
	}
	
	
	
	
	
}
