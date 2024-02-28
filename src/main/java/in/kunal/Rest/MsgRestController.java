package in.kunal.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.kunal.Service.MsgService;

@RestController
public class MsgRestController {
	
	@Autowired
	private MsgService msgservice;
	
	@GetMapping("/welcome")
	public String getwelcomemsg() {
	  String msg =	msgservice.welcomemsg();
	  msg  = msg.toUpperCase();
	  return msg;
	}
	
	@GetMapping("/greet")
	public String getgreet() {
		String msg = msgservice.greetmsg();
		return msg;
	}

}
