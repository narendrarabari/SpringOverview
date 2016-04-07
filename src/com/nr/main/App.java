package com.nr.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nr.entities.User;

/**
 * 
 * @author narendra rabari
 *
 */
@SuppressWarnings("deprecation")
public class App {
	
	public static void main(String args[]){
		//BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("Bean.xml"));
		ApplicationContext context= new ClassPathXmlApplicationContext("Bean.xml");
		User user = (User) context.getBean("user");
		user.demoDisplay();
	}

}
