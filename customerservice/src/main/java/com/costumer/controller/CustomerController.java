package com.costumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.model.Customer;
import com.customer.service.Customerservice;

@RestController
public class CustomerController{

	@Autowired
	Customerservice service;


	
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
	
	
     return new ResponseEntity<Customer>( service.addCustomer(customer), HttpStatus.CREATED);
	}
	
	@GetMapping("/withdraw")
	public ResponseEntity<String> withdraw(String s,int i)
	{
		service.withdrawn(s, i);
	 return new  ResponseEntity<String> ("withdrawn succesfully",HttpStatus.OK);
	}
	
	@PostMapping("/deposite")
	public ResponseEntity<String> deposite(@RequestBody String name, int deposit) {
	
		service.deposit(name, deposit);
     return new ResponseEntity<String> ("Deposited succesfully",HttpStatus.OK);
	}

	

/*@GetMapping("/getCutomer")
public ResponseEntity<?> getCustomerDtls() {

ResponseEntity<?> resp = null;

List<Customer> listOfCust = service.customerDetails();

resp = new ResponseEntity<List<Customer>>(listOfCust, HttpStatus.FOUND);

return resp;
}*/

/*@DeleteMapping("/delete/id")
public ResponseEntity<?>deleteCustById(@PathVariable("id") int id){
ResponseEntity<?> resp = null;
service.deleteCustomerAccount(id);
resp = new ResponseEntity<String>("customer = "+id+" deleted", HttpStatus.OK);

return resp;
}*/	
	
}






