package com.occamsrazor.web.sns;

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
		return snsService.join(sns)? Messenger.SUCCESS: Messenger.FAIL;
		
	}
	
}
