package com.bl.greetingapp.service;

import java.util.List;

import com.bl.greetingapp.model.Greeting;
import com.bl.greetingapp.model.User;

public interface IGreetingService {

	Greeting addGreeting(User user, Greeting greeting);

	Greeting findGreetingById(long id);

	List<Greeting> getAllGreetings();

	Greeting editGreeting(Greeting greeting);
	
}
