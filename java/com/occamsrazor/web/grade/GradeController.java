package com.occamsrazor.web.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.util.Credit;
import com.occamsrazor.web.util.Messenger;

@RestController
@RequestMapping("/grade")
public class GradeController {
	@Autowired GradeService gradeService;
	
	@PostMapping("/input")
	public Messenger input(@RequestBody Grade grade) {
		int current = gradeService.count();
		gradeService.input(grade);
		return (gradeService.count() == current+1)? Messenger.SUCCESS : Messenger.FAIL;
	}
	
	public Credit result(@RequestBody Grade userId) {
		Credit result = null;
		return result;
		
	}
}
