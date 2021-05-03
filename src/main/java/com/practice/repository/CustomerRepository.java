package com.practice.repository;

import com.practice.status.LoginStatus;

public interface CustomerRepository {
	
	public LoginStatus loginCustomer(String emailId, String password);

}
