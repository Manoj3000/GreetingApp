package com.bl.greetingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.greetingapp.dao.IGreetingApp;
import com.bl.greetingapp.model.Greeting;
import com.bl.greetingapp.model.User;

@Service
public class GreetingServiceImpl implements IGreetingService {

	@Autowired
	private IGreetingApp greetingApp;
	
	@Override
	public Greeting addGreeting(User user, Greeting greeting) {
		String message = String.format("Hello %s ",
				(user.getFirstname().isEmpty()) ? (user.getLastname().isEmpty()) ? "World" : user.getLastname()
						: user.getLastname().isEmpty() ? user.getFirstname() : user.getFirstname()+" "+user.getLastname());
		greeting.setMessage(message);
		return greetingApp.save(greeting);
	}

	@Override
	public Greeting findGreetingById(long id) {
		return greetingApp.findById(id).get();
	}

	@Override
	public List<Greeting> getAllGreetings() {
		return greetingApp.findAll();
	}

	@Override
	public Greeting editGreeting(Greeting greeting) {
		Greeting greetingDetails = greetingApp.findById(greeting.getId()).get();
		greetingDetails.setMessage(greeting.getMessage());
		return greetingApp.save(greetingDetails);
	}

}
