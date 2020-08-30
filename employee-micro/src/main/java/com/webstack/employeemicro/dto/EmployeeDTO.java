package com.webstack.employeemicro.dto;

public class EmployeeDTO {

	private Long empId;
	private String employeeName;
	private String dept;
	private Long salary;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

}
