package com.occamsrazor.web.grade;

public interface GradeService {
	public Grade[] list();
	public Grade detail(String grade);
	public void add(Grade grade);
	public int count();
	public void update(Grade grade);
	public void delete(Grade grade);
}
