package com.webstack.employeemicro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webstack.employeemicro.dto.EmployeeDTO;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@GetMapping("/employees")
	public List<EmployeeDTO> getEmployeeList(){
		EmployeeDTO emp1 = new EmployeeDTO();
		emp1.setEmpId(27L);
		emp1.setEmployeeName("keyur");
		emp1.setDept("IT");
		emp1.setSalary(99999l);
		
		EmployeeDTO emp2 = new EmployeeDTO();
		emp2.setEmpId(26L);
		emp2.setEmployeeName("denish");
		emp2.setDept("R&D");
		emp2.setSalary(19999l);
		
		EmployeeDTO emp3 = new EmployeeDTO();
		emp3.setEmpId(44L);
		emp3.setEmployeeName("vinit");
		emp3.setDept("IT");
		emp3.setSalary(29999l);
		
		List<EmployeeDTO> empList = new ArrayList<EmployeeDTO>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		return empList;
	}
	
}
