package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.repository.CustomerRepository;
import com.practice.status.LoginStatus;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository custRepo;

	@Override
	public LoginStatus loginCustomer(String emailId, String password) {
		return custRepo.loginCustomer(emailId, password);
	}
	

}
