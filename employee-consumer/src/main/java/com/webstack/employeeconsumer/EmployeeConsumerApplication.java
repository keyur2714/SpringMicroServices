package com.webstack.employeeconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EmployeeConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeConsumerApplication.class, args);
	}

}
