package com.webstack.employeeconsumer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webstack.employeeconsumer.dto.EmployeeDTO;
import com.webstack.employeeconsumer.service.EmployeeRemoteCallService;

@RestController
@RequestMapping("/api")
public class CunsumerController {

	@Autowired
	private LoadBalancerClient client;

	@Autowired
	private EmployeeRemoteCallService remoteClient;

	@GetMapping("/empList")
	public List<EmployeeDTO> getEmployees() {

		ServiceInstance serviceInstance = client.choose("employee-micro");

		System.out.println(serviceInstance.getUri());

		String baseUrl = serviceInstance.getUri().toString();

		baseUrl = baseUrl + "/api/employees";

		System.out.println(baseUrl);

		RestTemplate restTemplate = new RestTemplate();
		List<EmployeeDTO> employees = null;
		try {

			employees = Arrays.asList(restTemplate.getForObject(baseUrl, EmployeeDTO[].class));
		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println(employees);

		return employees;

	}

	@GetMapping("/feignEmpList")
	public List<EmployeeDTO> getEmployeeList() {

		List<EmployeeDTO> employees = remoteClient.getEmployeeList();

		System.out.println(employees);

		return employees;

	}
}
