package com.manager.service;

import java.util.List;
import java.util.Optional;

import com.manager.model.CustomerAccounts;
import com.manager.model.Transactions;



public interface ManagerService {
	public void deleteCustomer(int cid);//Delete Customer account
	public List<CustomerAccounts> displayAllCustomers();//display all the customers
	public CustomerAccounts custInfoById(int id);
	
	}




