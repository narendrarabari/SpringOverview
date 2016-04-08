package com.nr.entities;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
	private UserPost userPost1;
	private UserPost userPost2;
	


	/**
	 * 
	 * @return FistName of the User
	 */
	public String getFirstName() {
		return firstName;
	}
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
	public void setAddressObj(Address addressObj) {
		this.addressObj = addressObj;
	}

	/**
	 * @return the userPost1
	 */
	public UserPost getUserPost1() {
		return userPost1;
	}
	/**
	 * @param userPost1 the userPost1 to set
	 */
	public void setUserPost1(UserPost userPost1) {
		this.userPost1 = userPost1;
	}
	/**
	 * @return the userPost2
	 */
	public UserPost getUserPost2() {
		return userPost2;
	}

	/**
	 * @param userPost2 the userPost2 to set
	 */
	public void setUserPost2(UserPost userPost2) {
		this.userPost2 = userPost2;
	}

	/**
	 * It used to print static text on the screen 
	 * 
	 */
	public void demoDisplay(){
		System.out.println("Hello World From User !!");
	}
	public void displayUserPosts(){
		System.out.println("User post id:"+userPost1.getPostId());
		System.out.println("User post content:"+userPost1.getContent());
		System.out.println("User post id:"+userPost2.getPostId());
		System.out.println("User post content:"+userPost2.getContent());
		
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
