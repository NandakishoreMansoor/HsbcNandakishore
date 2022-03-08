package com.customer.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

public class Customerprox {
	@FeignClient(name="ManagerService", url="http://localhost:8761/")
	public interface CustomerProxy {
	    @GetMapping("/addcust")
	    public List<Customerservice> addCustomer();
	}
}
