package com.webstack.customers.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webstack.customers.dto.CustomerDTO;

@RestController
@RequestMapping("/api")
public class CustomersController {

	@Value("${customer.name}")
	private String customerName;
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello Radhe Krishna...!"+customerName;
	}
	
	@GetMapping("/customerList")
	public List<CustomerDTO> customerList() {
		List<CustomerDTO> custList = new ArrayList<>();
		CustomerDTO customer1 = new CustomerDTO();
		customer1.setName("keyur");
		customer1.setMobileNo("7387029671");
		customer1.setAddress("A-1106,Alcove Society,Pune");
		
		CustomerDTO customer2 = new CustomerDTO();
		customer2.setName("denish");
		customer2.setMobileNo("7387029111");
		customer2.setAddress("Jiao Bhestan,Surat");
		
		
		CustomerDTO customer3 = new CustomerDTO();
		customer3.setName("vinit");
		customer3.setMobileNo("9879534778");
		customer3.setAddress("B-A,Adajan,Surat");
		
		custList.add(customer1);
		custList.add(customer2);
		custList.add(customer3);
		
		return custList;
	}
	
}
