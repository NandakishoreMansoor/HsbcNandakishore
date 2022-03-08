package com.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@EnableEurekaClient
public class ManagerApplication {
	
	public static void main(String[] args) {
	SpringApplication.run(ManagerApplication.class, args);
	}
	}


	




