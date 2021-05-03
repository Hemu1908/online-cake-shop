package com.practice.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.practice.entity.Customer;
import com.practice.status.LoginStatus;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

	@PersistenceContext
	EntityManager em;
	
	//Validate user login credentials
	@Override
	public LoginStatus loginCustomer(String emailId, String password) {
		String jpql = "select c from Customer c where c.email: = email AND c.password: = pwd";
		Query query = em.createQuery(jpql);
		query.setParameter("email", emailId);
		query.setParameter("pwd", password);
		LoginStatus lstatus = new LoginStatus();
		try {
			Customer customer = (Customer) query.getSingleResult();
			lstatus.setCustomerId(customer.getCustomerId());
			lstatus.setEmailId(customer.getEmail());
			lstatus.setName(customer.getName());
			lstatus.setCustomerStatus("Success");
			return lstatus;
		}
		catch(Exception e) {
			lstatus.setCustomerStatus("Failed");
			return lstatus;
		}
	}

}
