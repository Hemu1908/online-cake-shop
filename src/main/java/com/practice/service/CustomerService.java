package com.practice.service;

import com.practice.status.LoginStatus;

public interface CustomerService {
	
	public LoginStatus loginCustomer(String emailId, String password);

}
