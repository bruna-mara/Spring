package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {

	@GetMapping 
	public String hello () {
		return "Hello Generation!!!";
	}
//	@GetMapping("/get2")
//	public String hello2() {
//		return "Hello Generation 2!!!";
//	}

}

