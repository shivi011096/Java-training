package com.configurejava.javaconfig.service;

import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.configurejava.javaconfig.dao.CustomerDao;
import com.configurejava.javaconfig.model.Customer;

@Component("service")
public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;

	@Autowired
	public CustomerServiceImpl(CustomerDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.getCustomerById(uId);
	}

	@Override
	public int updateCustomerById(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updateCustomerById(customer);
	}

	@Override
	public int deleteCustomer(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(uId);
	}

}