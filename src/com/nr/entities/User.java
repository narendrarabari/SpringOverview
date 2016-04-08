package com.nr.entities;

/**
 * 
 * @author narendra rabari
 *
 */
public class User {
	
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public User() {
		
	}

	String firstName;
	String lastName;
	private Address addressObj;
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
	
	
	
}
