package com.practice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.practice.dto.LoginDto;
import com.practice.service.CustomerService;
import com.practice.status.LoginStatus;

public class CustomerController {
	
	@Autowired
	CustomerService custService;

	 @PostMapping(value = "/logincustomer")
	   public LoginStatus loginCustomer(@RequestBody LoginDto loginData, HttpSession session) {
		 return custService.loginCustomer(loginData.getEmailId(), loginData.getPassword());
	 }
}
