package test.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.uitl.Messenger;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired MemberService memberService;
	
	public Messenger add(@RequestBody Member member) {
		int current = memberService.count();
		return (memberService.count() == (current+1))? Messenger.SUCCESS : Messenger.FAIL;
	}
	@PostMapping("/login")
	public Messenger login(@RequestBody Member member) {
		return (memberService.login(member))? Messenger.SUCCESS : Messenger.FAIL;
	}
	@GetMapping("/list")
	public Member[] list() {
		Member[] members = new Member[5];
		return members;
	}
	@GetMapping("/detail")
	public Member detail(@RequestBody Member member) {
		Member returnDetail = new Member();
		return returnDetail;
	}
	@GetMapping("/count")
	public int count() {
		int count = 0;
		return count;
	}
	@PutMapping("/update")
	public Member update(Member member) {
		Member returnUpdate = new Member();
		return returnUpdate;
	}
	@DeleteMapping("/delete")
	public Member delete(Member member) {
		Member returnDelete = new Member();
		return returnDelete;
	}
	
}
