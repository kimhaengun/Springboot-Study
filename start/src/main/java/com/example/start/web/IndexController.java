package com.example.start.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
@Controller
public class IndexController {
	
	//http://localhost:8080/index
	@GetMapping("/index")
	public String index() {
		return "index함수힙니다.";
	}
	
	@GetMapping("/hello")
	public String hell() {
		return "hello";
	}
}