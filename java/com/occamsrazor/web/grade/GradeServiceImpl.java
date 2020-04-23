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
	public void input(Grade grade) {
		grades[count] = grade;
		count++;
	}

	@Override
	public Credit credit(Grade userId) {
		Credit credit = null;
		for(int i=0; i<count; i++) {
			if(userId.equals(grades[i].getUersId())) {
				switch(avg(userId)) {
				case 10: case 9: credit = Credit.A; break;
				case 8: credit = Credit.B; break;
				case 7: credit = Credit.C; break;
				case 6: credit = Credit.D; break;
				case 5: credit = Credit.E; break;
				default : credit = Credit.F; break;
				}
			}
		}
		return credit;
	}

	private int sum(Grade userId) {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			if (userId.equals(grades[i].getUersId())) {
				sum = Integer.parseInt(grades[i].getKorean())
						+ Integer.parseInt(grades[i].getEnglish())
						+ Integer.parseInt(grades[i].getMath()) 
						+ Integer.parseInt(grades[i].getJava());
			}
		}
		return sum;
	}
	
	private int avg(Grade userId) {
		return sum(userId)/4;
	}
	
	public int count() {
		return count;
	}
	
}
