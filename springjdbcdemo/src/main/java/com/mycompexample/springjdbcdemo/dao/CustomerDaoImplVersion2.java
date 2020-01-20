package com.mycompexample.springjdbcdemo.dao;

import java.sql.SQLException
;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mycompexample.springjdbcdemo.model.Customer;
import com.mycompexample.springjdbcdemo.model.CustomerRowMapper;

import lombok.Setter;

@Component("dao2")

public class CustomerDaoImplVersion2 implements CustomerDao2 {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		String sql="insert into customer(uid,firstname,lastname,email) values(?,?,?,?)";
		jdbcTemplate.update(sql, 
				new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		
		String query="select uid,firstname,lastname,email from customer";
		
		
		return jdbcTemplate.query(query, new CustomerRowMapper());
	}

	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
		String query="select uid,firstname,lastname,email from customer where uid=?";
		return jdbcTemplate.query(query, new Object[] {uId},new CustomerRowMapper());
	}

	@Override
	public int updateCustomerById(Customer customer) throws SQLException {
	
		String sql="update customer set firstname = ?, lastname=?, email= ? WHERE uid=?";
		jdbcTemplate.update(sql, 
				new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		return 1;
	}

	@Override
	public int deleteCustomer(String uid) throws SQLException {
		String deleteQuery="delete from customer where uid=?";
		jdbcTemplate.update(deleteQuery, uid);
		return 1;
	}

}