package com.nr.entities;

import org.springframework.stereotype.Component;

/**
 * 
 * @author narendra rabari
 *
 */
@Component
public class UserPost {
	
	private String postId;
	private String content;
	

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * @return the postId
	 */
	public String getPostId() {
		return postId;
	}


	/**
	 * @param postId the postId to set
	 */
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public void display(){
		System.out.println("User Post display method is called");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserPost [postId=" + postId + ", content=" + content + "]";
	}
}
