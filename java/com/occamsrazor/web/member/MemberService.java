package com.occamsrazor.web.member;

import com.occamsrazor.web.uitl.Messenger;

public interface MemberService {
	public int count() ;
	public void add(Member member);
	public boolean login(Member member);
}
