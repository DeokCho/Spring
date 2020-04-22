package com.occamsrazor.web.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.uitl.Credit;
import com.occamsrazor.web.uitl.Messenger;

@RestController
@RequestMapping("/grade")
public class GradeController {
	@Autowired GradeService gradeService;

	@PostMapping("/register")
	public Messenger add(@RequestBody Grade grade) {
		int current = gradeService.count();
		gradeService.add(grade);
		return (gradeService.count()==(current+1))? Messenger.SUCCESS : Messenger.FAIL;
	}
	
	public Credit credit(@RequestBody Grade grade) {
		Credit credit = null;
		
		return credit;
	}
}
