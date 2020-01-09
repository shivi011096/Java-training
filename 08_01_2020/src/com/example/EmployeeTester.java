package com.example;

public class EmployeeTester 
{
		
		public static void main(String args[]) throws EmployeeNotSelectedException
		{
			Employee employee=new Employee("1545", "Shivi", 1);
			employee.createEmployee("John",3);
			System.out.println(employee);
		
		}

	

}
