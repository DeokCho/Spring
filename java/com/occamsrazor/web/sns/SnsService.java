package com.occamsrazor.web.sns;

public interface SnsService {
	public Sns detail(String sns);
	public int count();
	public void add(Sns sns);
	public Sns login(Sns sns);
}