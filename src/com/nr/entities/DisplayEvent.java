package com.nr.entities;

import org.springframework.context.ApplicationEvent;

public class DisplayEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DisplayEvent(Object source) {
		super(source);
		
	}
	public String toString(){
		return "Display  Event is Occured";
	}

}
