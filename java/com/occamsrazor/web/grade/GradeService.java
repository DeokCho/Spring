package com.occamsrazor.web.grade;

import com.occamsrazor.web.util.Credit;

public interface GradeService {
	public void input(Grade grade);
	public Credit credit(Grade userId);
	public int count();
}
