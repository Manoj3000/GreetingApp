package com.bl.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {

	@Override
	public String addGreeting() {
		return "Hello World";
	}
	
}
