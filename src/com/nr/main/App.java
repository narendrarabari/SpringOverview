package com.nr.main;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nr.entities.User;

/**
 * 
 * @author narendra rabari
 *
 */

public class App {
	
	private static AbstractApplicationContext context;

	public static void main(String args[]){
		context = new ClassPathXmlApplicationContext("Bean.xml");
		context.registerShutdownHook();
		User user = (User) context.getBean("user1");
		user.demoDisplay();
		
		System.out.println(user);
	}

}
