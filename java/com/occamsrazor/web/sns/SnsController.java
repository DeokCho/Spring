package com.occamsrazor.web.sns;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.uitl.Messenger;

@RestController
@RequestMapping("/sns")
public class SnsController {
	@Autowired SnsService snsService;
	
	@PostMapping("/join")
	public Messenger join(@RequestBody Sns sns) {
		int current = snsService.count();
		snsService.add(sns);
		return (snsService.count()==current+1)? Messenger.SUCCESS: Messenger.FAIL;
	}
	
	@PostMapping("/login")
	public Map<String, Object> login(@RequestBody Sns sns){
		Map<String, Object> returnMap = new HashMap<>();
		Sns loginSns = snsService.login(sns);
		if(loginSns != null) {
			returnMap.put("sns", loginSns);
			returnMap.put("messenger", Messenger.SUCCESS);
		}else {
			returnMap.put("messenger", Messenger.FAIL);
		}
		return returnMap;
	}
		
}
