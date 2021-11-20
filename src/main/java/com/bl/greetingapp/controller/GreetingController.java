package com.bl.greetingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bl.greetingapp.service.IGreetingService;


@RestController
public class GreetingController
{
	@Autowired
	private IGreetingService greetingService;
	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingService.addGreeting();
	}
	
}
