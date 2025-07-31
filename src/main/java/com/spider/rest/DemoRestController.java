package com.spider.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/contact")
	public String getContactInfo() {
		return "call : +91 8262820379";
	}
	
	@GetMapping("/welcome")
	public String getMsg() {
		return "Good Morning";
	}
	
	@GetMapping("/greet")
	public String getGreet() {
		return "Good Morning";
	}
	
}
