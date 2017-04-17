package chitra.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@RequestMapping("/check")
	public String checkString(){
		return "I am ready";
	}

}
