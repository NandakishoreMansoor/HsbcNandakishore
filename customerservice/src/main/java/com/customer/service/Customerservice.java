package com.customer.service;

import java.util.List;
import java.util.Optional;

import com.customer.model.Transactionss;
import com.customer.model.Customer;

public interface Customerservice<Transactionss> {
	
	
	public Customer addCustomer(Customer customer);
	
	//public List<Customer> customerDetails();
	
	//public void deleteCustomerAccount(int id);
	
	public void withdrawn(String name, int withdrawal);
	
	void deposit(String name, int deposit);
	
	 public double check(int cid);

	
		
	}


