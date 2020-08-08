package com.webstack.billingsys.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webstack.billingsys.dto.BillingDTO;
import com.webstack.billingsys.dto.CustomerDTO;
import com.webstack.billingsys.dto.ItemsDTO;

@RestController
@RequestMapping("/api")
public class BillingController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/sayHi")
	public String sayHello() {
		return "Hello Radhe Krishna...!";
	}
	
	@GetMapping("/bill/{name}")
	public BillingDTO generateBill(@PathVariable String name) {
		BillingDTO billingDTO = new BillingDTO();
		
		billingDTO.setBillNo(11111l);
		billingDTO.setBillDate(new Date(System.currentTimeMillis()));
		
		List<CustomerDTO> customers = Arrays.asList(restTemplate.getForObject("http://CUSTOMERS-MICRO/api/customerList", CustomerDTO[].class)); 
		CustomerDTO customer =  customers.stream().filter(c->c.getName().equals(name)).collect(Collectors.toList()).get(0);
		billingDTO.setCustomer(customer);
		
		ItemsDTO item1 = new ItemsDTO(1l,"Tea",10.0,2);
		ItemsDTO item2 = new ItemsDTO(2l,"Coffee",20.0,1);
		ItemsDTO item3 = new ItemsDTO(3l,"Cream Roll",10.0,2);
		
		List<ItemsDTO> items = new ArrayList<>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		billingDTO.setItems(items);
		
		return billingDTO;
		
	}
	
}
