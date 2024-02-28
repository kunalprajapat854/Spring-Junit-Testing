package in.kunal.Service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {
	
	public String welcomemsg() {
		String msg = "Welcome to Chrome browser";
		return msg; 
		
	}
	
	public String greetmsg() {
		String msg = "Hey good morning";
		return msg;
	}

}
