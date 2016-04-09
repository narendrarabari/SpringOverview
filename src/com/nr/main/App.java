package com.nr.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nr.entities.User;
import com.nr.entities.UserPost;

/**
 * 
 * @author narendra rabari
 *
 */

public class App {
	
	private static ApplicationContext context;

	public static void main(String args[]){
		context = new ClassPathXmlApplicationContext("Bean.xml");
		//context.registerShutdownHook();
		User  user= (User) context.getBean("user1");
		user.demoDisplay();
	}

}
