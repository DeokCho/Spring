package com.occamsrazor.web.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/grade")
public class GradeController {

	@Autowired GradeService gradeService;
	
	
}
