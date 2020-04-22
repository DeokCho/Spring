package com.occamsrazor.web.grade;

import com.occamsrazor.web.uitl.Credit;

public interface GradeService {
	public Grade[] list();
	public Grade detail(String grade);
	public void add(Grade grade);
	public int count();
	public void update(Grade grade);
	public void delete(Grade grade);
	public int sum(Grade grade);
	public int average(Grade grade);
	public Credit credit(int average);
}
