package com.mycompexample.springjdbcdemo.service;

import java.sql.SQLException;

import java.util.List;

import com.mycompexample.springjdbcdemo.model.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers()throws SQLException;
	public List<Customer> getCustomerById(String uId) throws SQLException;
	public int updateCustomerById(Customer customer)throws SQLException;
	public int deleteCustomer(String uId) throws SQLException;
}