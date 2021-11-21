package com.bl.greetingapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bl.greetingapp.model.Greeting;

public interface IGreetingApp extends JpaRepository<Greeting, Long>{

}
