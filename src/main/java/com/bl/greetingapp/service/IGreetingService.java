package com.bl.greetingapp.service;

import com.bl.greetingapp.model.Greeting;
import com.bl.greetingapp.model.User;

public interface IGreetingService {

	Greeting addGreeting(User user, Greeting greeting);

}
