package com.springCustomer.Customer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDao {
List<Customer> list = null;
Customer cm;
public Customer createCustomer(String firstname, String lastname, String email, String id)
{
	cm.setFirstname(firstname);
	cm.setLastname(lastname);
	cm.setEmail(email);
	cm.setId(id);
	list.add(cm);
	return cm;	
}
public List<Customer> displayCustomer()
{
	return list;	
}
public Customer findById(String id)
{
	for(Customer c : list)
	{
		if(c.getId().equals(id))
		{
			cm.setFirstname(c.getFirstname());
			cm.setLastname(c.getLastname());
			cm.setEmail(c.getEmail());
			cm.setId(c.getId());
		}
	}
	return cm;	
}
}