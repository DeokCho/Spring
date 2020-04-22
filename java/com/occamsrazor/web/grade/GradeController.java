package com.occamsrazor.web.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public Messenger register(@RequestBody Grade grade) {
		int current = gradeService.count();
		Messenger messenger = null;
		gradeService.add(grade);
		return (gradeService.count() == current+1)? messenger.SUCCESS: messenger.FAIL;
	}
	
	@GetMapping("/report/{userid}")
	public Credit report(@PathVariable String userid) {
		return gradeService.detail(userid);
	}

}