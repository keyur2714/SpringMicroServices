package com.webstack.employeeconsumer.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webstack.employeeconsumer.dto.*;

@FeignClient("employee-micro")
public interface EmployeeRemoteCallService {
	@RequestMapping(value="/api/employees",method=RequestMethod.GET)
	public List<EmployeeDTO> getEmployeeList();
}
