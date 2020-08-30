package com.webstack.employeemicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class EmployeeMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMicroApplication.class, args);
	}

}
