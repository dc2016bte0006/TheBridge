package com.metroAG.ques3.exception;

public class UserNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	private String msg;
	public UserNotFoundException(String msg) {
		super(msg);
		this.msg=msg;
	}
	
	public UserNotFoundException() {
		
	}
}
