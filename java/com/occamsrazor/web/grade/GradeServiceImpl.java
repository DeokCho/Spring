package com.occamsrazor.web.grade;

import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
	private Grade[] grades;
	private int count;

	public GradeServiceImpl() {
		grades = new Grade[5];
		count = 0;
	}

	@Override
	public Grade[] list() {
		return grades;
	}

	@Override
	public Grade detail(String userid) {
		Grade grade = null;
		for(int i=0; i<count; i++) {
			if(userid.equals(grades[i].getUserid())) {
				grade = grades[i];
			}
		}
		return grade;
	}

	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public void update(Grade grade) {
		
	}

	@Override
	public void delete(Grade grade) {
	}

}
