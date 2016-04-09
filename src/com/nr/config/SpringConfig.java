package com.nr.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nr.entities.User;

@Configuration
public class SpringConfig {
	
	@Bean(name="user0")
	public User user(){
		return new User();
	}
	
	@Bean
	@Qualifier("user1")
	public User user1(){
		return new User("Narendra","Rabari");
	}

}
