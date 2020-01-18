package com.springCustomer.Customer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Service {
CustomerDao custdao;
public Customer createCustomer(String firstname, String lastname, String email, String id)
{
	return custdao.createCustomer(firstname, lastname, email, id);
}
public List<Customer> displayCustomer()
{
		return custdao.displayCustomer();
}
public Customer findById(String id)
{
	
	return custdao.findById(id);	
} 
}