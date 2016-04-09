package com.nr.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nr.config.SpringConfig;
import com.nr.entities.User;
import com.nr.entities.UserPost;

/**
 * 
 * @author narendra rabari
 *
 */

public class App {
	
	

	public static void main(String args[]){
		ApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(SpringConfig.class);
		User user=(User) ctx.getBean("user1");
		System.out.println(user);
		
	}

}
