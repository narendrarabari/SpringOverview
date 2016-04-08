package com.nr.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nr.entities.User;

/**
 * 
 * @author narendra rabari
 *
 */

public class App {
	
	private static ApplicationContext context;

	public static void main(String args[]){
		context = new ClassPathXmlApplicationContext("Bean.xml");
		User user = (User) context.getBean("user1");
		user.demoDisplay();
		user.displayUserPosts();
		System.out.println(user);
	}

}
