package com.manager.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manager.model.CustomerAccounts;

public interface Managerprox {
	@FeignClient(name="CustomerService", url="http://localhost:8761")
	public interface ManagerProxy {
	    @GetMapping("/getcutomer")
	    public List<CustomerAccounts> displayAllCustomers();
	    
	    @DeleteMapping("/delete/id")
	    public ResponseEntity<?>deleteAccountById(@PathVariable("id") int id);

	}
}
