package com.customer.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.customer.model.Customer;
import com.customer.model.Transactionss;
import com.customer.repo.customerRepo;

public class customerserviceimplement implements Customerservice {
	@Autowired
	private customerRepo repo;
	
	@Autowired
	private Transactionss tran;

	@Override
	public Customer addCustomer(Customer customer) {
		return repo.save(customer);
	}

	// for withdraw
	@Override
	public void withdrawn(String name, int withdrawal) {
		int total = 100;
		if (total >= withdrawal) {
			System.out.println(name + " withdrawn " + withdrawal);

			total = total - withdrawal;
			System.out.println("Balance after withdrawal: " + total);
		}
		else {

			System.out.println(name + " you can not withdraw " + withdrawal);

			System.out.println("your balance is: " + total);
		}
	}

	@Override
	public void deposit(String name, int deposit) {
		int total = 0;
		int deposite = 100;
		if (deposite >= 100) {
			System.out.println("deposioted");
		} else {
			System.out.println("minimum deposite should be 100");
		}

		System.out.println(name + " deposited " + deposit);
		total = total + deposit;
		System.out.println("Total after deposit: " + total);

	}

	@Override
	public double check(int cid) {
		
		return 0;
	}





	}

