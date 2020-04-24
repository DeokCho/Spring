package com.occamsrazor.web.sns;

public interface SnsService {
	public boolean join(Sns sns);
	public Sns detail(String sns);
}