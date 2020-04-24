package com.occamsrazor.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.uitl.Messenger;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired UserService userService;
	
	@PostMapping("/join")
	public Messenger join(@RequestBody User user) {
		int count = userService.count();
		userService.add(user);
		return (userService.count() == count+1)? Messenger.SUCCESS: Messenger.FAIL;
	}
	@PostMapping("/login")
	public Map<String, Object> login(@RequestBody User user) {
		Map<String, Object> returnMap = new HashMap<>();
		User loginUser = userService.login(user);
		if(loginUser != null) {
			returnMap.put("user", loginUser);
			returnMap.put("messenger", Messenger.SUCCESS);
		}else {
			returnMap.put("messenger", Messenger.FAIL);
		}
		return returnMap; 
	}
	@GetMapping("/detail/{userId}")
	public User detail(@PathVariable String userId) {
		return userService.detail(userId);
	}
	
	@PutMapping("/update")
	public Messenger update(@RequestBody User user) {
		System.out.println("업데이트 완료 : "+user);
		return (userService.update(user))?Messenger.SUCCESS:Messenger.FAIL;
	}
	
	@DeleteMapping("/remove/{userId}")
	public Messenger remove(@PathVariable String userId) {
		System.out.println("삭제 : "+userId);
		return (userService.remove(userId))? Messenger.SUCCESS:Messenger.FAIL;
	}
	
}
