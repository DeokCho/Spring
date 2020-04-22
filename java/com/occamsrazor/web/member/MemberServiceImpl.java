package com.occamsrazor.web.member;

import org.springframework.stereotype.Service;

import com.occamsrazor.web.uitl.Messenger;

@Service
public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}

	public int count() {
		return count;
	}
	
	public void add(Member member) {
		members[count] = member;
		count++;
	}
	
	public boolean login(Member member) {
		boolean login = false;
		for(int i=0; i<count; i++) {
			if(member.getUserId().equals(members[i].getUserId())
					&& member.getPasswd().equals(members[i].getPasswd())) {
				login = true;
			}
		}
		return login;
	}
}
