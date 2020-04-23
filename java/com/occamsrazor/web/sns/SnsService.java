package com.occamsrazor.web.sns;

import java.util.Map;

import com.occamsrazor.web.uitl.Messenger;

public interface SnsService {
	public void add(Sns sns);
	public int count();
	public Sns login(Sns sns);
	
}
