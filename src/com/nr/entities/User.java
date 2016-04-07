package com.nr.entities;

/**
 * 
 * @author narendra rabari
 *
 */
public class User {

	String firstName;
	String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void demoDisplay(){
		System.out.println("Hello World From User !!");
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}
