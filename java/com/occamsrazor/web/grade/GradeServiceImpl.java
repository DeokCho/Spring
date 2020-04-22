package com.occamsrazor.web.grade;

import org.springframework.stereotype.Service;

import com.occamsrazor.web.uitl.Credit;
import com.occamsrazor.web.uitl.Messenger;

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

	@Override
	public int sum(Grade grade) {
		int gradeSum = 0;
		for(int i=0; i<count; i++) {
			if(grade.getUserid().equals(grades[i].getUserid())) {
				gradeSum = Integer.parseInt(grade.getKorean())
						+Integer.parseInt(grade.getEnglish())
						+Integer.parseInt(grade.getMath())
						+Integer.parseInt(grade.getJava());
			}
		}
		return gradeSum;
	}
	
	@Override
	public int average(Grade grade) {
		int average = 0;
		for(int i=0; i<count; i++) {
			if(grade.getUserid().equals(grades[i].getUserid())) {
				average = sum(grade)/3;
			}
		}
		return average;
	}


	@Override
	public Credit credit(int average) {
		 Credit credit = Credit.F;
		switch(average/10) {
		case 5: credit= Credit.E; break;
		case 6: credit= Credit.D; break;
		case 7: credit= Credit.C; break;
		case 8: credit= Credit.B; break;
		case 9: credit= Credit.A; break;
		case 10: credit= Credit.A; break;
		}
		return credit;
	}

}
