package com.occamsrazor.web.member;

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
	public Member[] list() {
		return members;
	}
	@Override
	public Member[] searchByName(String name) {
		Member[] returnMembers = null;
		int searchCount = count(name);
		if(searchCount!=0) {
			returnMembers = new Member[searchCount];
			int j=0;
			for(int i=0; i<count; i++) {
				if(name.equals(members[i].getName())) {
					returnMembers[j] = members[i];
					j++;
					if(searchCount==j){
						break;
					}
				}
			}
		}
		return returnMembers;
	}
	@Override
	public int count() {
		return count;
	}
	@Override
	public void update(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getId().equals(members[i].getId())){
				members[i].setPw(member.getPw());
			}
		}
	}
	@Override
	public void delete(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getId().equals(members[i].getId()) &&
					member.getPw().equals(members[i].getPw())) {
				members[i] = members[count-1];
				members[count-1]=null;
				count--;
			}
		}
	}

	@Override
	public Member[] searchByGender(String gender) {
		return null;
	}

	@Override
	public Member detail(String userId) {
		Member returnDetail = new Member();
		for(int i=0; i<count; i++) {
			if(userId.equals(members[i].getId())) {
				returnDetail = members[i];
			}
		}
		return null;
	}

	@Override
	public int count(String name) {
		int returnCount = 0;
		for(int i=0; i<count; i++) {
			if(name.equals(members[i].getName())) {
				returnCount++;
			}
		}
		return returnCount;
	}

	@Override
	public Member login(Member member) {
		Member returnLogin = null;
		for(int i=0; i<count; i++) {
			if(member.getId().equals(members[i].getId()) && member.getPw().equals(members[i].getPw())) {
				returnLogin = members[i];
			}
		}
		return returnLogin;
	}
	
}
