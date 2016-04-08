package com.nr.entities;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * 
 * @author narendra rabari
 *
 */
public class User implements InitializingBean,DisposableBean {
	
	
	
	public User() {
		
	}
	
	private String firstName;
	private String lastName;
	private Address addressObj;
	


	/**
	 * 
	 * @return FistName of the User
	 */
	public String getFirstName() {
		return firstName;
	}
	@Required
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * 
	 * @return LastName of the User
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * 
	 * @param lastName
	 */
	@Required
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the addressObj
	 */
	public Address getAddressObj() {
		return addressObj;
	}

	/**
	 * @param addressObj the addressObj to set
	 */
	@Autowired
	public void setAddressObj(Address addressObj) {
		this.addressObj = addressObj;
	}

	

	

	/**
	 * It used to print static text on the screen 
	 * 
	 */
	public void demoDisplay(){
		System.out.println("Hello World From User !!");
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ",Address address1="+addressObj.getAddress1()+"  address2="+addressObj.getAddress2()+"]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialise bean method is called");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("distroy method is called");
	}
	
	
	
}
