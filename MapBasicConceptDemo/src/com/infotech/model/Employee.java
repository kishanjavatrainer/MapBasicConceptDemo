package com.infotech.model;

public class Employee {

	private Integer employeeId;
	private String employeeName;
	private Double salary;
	private String email;
	
	public Employee(Integer employeeId, String employeeName, Double salary, String email) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", email=" + email + "]";
	}
}
