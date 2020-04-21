package com.occamsrazor.web.member;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	
	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public Member[] list(Member member) {
		return members;
	}

	@Override
	public Member detail(String userid) {
		Member member = null;
		for(int i=0; i<count; i++) {
			if(userid.equals(members[i].getId())) {
				member = members[i];
			}
		}
		return member;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public void update(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getId().equals(members[i].getId())) {
				members[i].setPw(member.getPw());
				break;
			}
		}
	}

	@Override
	public void delete(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getId().equals(members[i].getId())
					&&
					member.getPw().equals(members[i].getPw())) {
				members[i] = members[count-1];
				members[count-1]=null;
				count--;
			}
		}
	}

	@Override
	public boolean login(Member member) {
		boolean ok = false;
		for(int i=0; i<count; i++) {
			if(member.getId().equals(members[i].getId())
					&&
					member.getPw().equals(members[i].getPw())) {
				ok = true;
				break;
			}else {
				ok = false;
			}
		}
		return ok;
	}
	
}