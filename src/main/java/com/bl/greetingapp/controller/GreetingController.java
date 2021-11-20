package com.bl.greetingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bl.greetingapp.model.User;
import com.bl.greetingapp.service.IGreetingService;

@RestController
public class GreetingController {
	@Autowired
	private IGreetingService greetingService;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(defaultValue = "") String firstname,
			@RequestParam(defaultValue = "") String lastname) {
		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		return greetingService.addGreeting(user);
	}

}
