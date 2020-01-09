package com.example;

import java.util.UUID;

public class Employee 
{
	private String empId;
	private String empName;
	private int empExperience;
	private Employee emp=null;

	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpExperience() {
		return empExperience;
	}


	public void setEmpExperience(int empExperience) {
		this.empExperience = empExperience;
	}


	public Employee getEmp() {
		return emp;
	}


	public void setEmp(Employee emp) {
		this.emp = emp;
	}


	public Employee(String empId, String empName, int empExperience)throws EmployeeNotSelectedException
	{
		super();
	
		this.empId = empId;
		this.empName = empName;
		this.empExperience=empExperience;
		
	}


	public Employee createEmployee(String empName, int empExperience)throws EmployeeNotSelectedException {
		
		
		emp=new Employee(UUID.randomUUID().toString(),empName,empExperience);
		if(emp.getEmpExperience()<2)
		{
			throw new EmployeeNotSelectedException("Employee is not eligible as experience is less than 2 years");
		}
		return emp;
		
	}


	public Employee() {
		super();
	}


	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empExperience=" + empExperience + "]";
	}
	

}
