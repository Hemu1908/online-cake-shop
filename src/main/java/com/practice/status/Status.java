package com.practice.status;

public class Status {
	
	private LoginStatusType status;
	private String message;
	
	public static enum LoginStatusType {
		SUCCESS, FAILURE;
	}

	public LoginStatusType getStatus() {
		return status;
	}

	public void setStatus(LoginStatusType status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
