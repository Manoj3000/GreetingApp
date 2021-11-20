package com.bl.greetingapp.service;

import org.springframework.stereotype.Service;

import com.bl.greetingapp.model.User;

@Service
public class GreetingServiceImpl implements IGreetingService {

	@Override
	public String addGreeting(User user) {
		String message = String.format("Hello %s ",
				(user.getFirstname().isEmpty()) ? (user.getLastname().isEmpty()) ? "World" : user.getLastname()
						: user.getLastname().isEmpty() ? user.getFirstname() : user.getFirstname()+" "+user.getLastname());
		return message;
	}

}
