package com.bl.greetingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bl.greetingapp.model.Greeting;
import com.bl.greetingapp.model.User;
import com.bl.greetingapp.service.IGreetingService;

@RestController
public class GreetingController {
	@Autowired
	private IGreetingService greetingService;

	@PostMapping("/greeting")
	public Greeting greeting(@RequestParam(defaultValue = "") String firstname,
			@RequestParam(defaultValue = "") String lastname, Greeting greeting) {
		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		return greetingService.addGreeting(user, greeting);
	}
	
	@GetMapping("/greeting/{id}")
	public Greeting findGreetingById(@PathVariable long id) {
		return greetingService.findGreetingById(id);
	}
	
	@GetMapping("/greetings")
	public List<Greeting> getAllGreetings() {
		return greetingService.getAllGreetings();
	}

	@PutMapping("/greeting")
	public Greeting editGreeting(@RequestBody Greeting greeting) {
		return greetingService.editGreeting(greeting);	
	}
}
