package com.mycustomer.MyCustomer;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import com.mycustomer.MyCustomer.Customer;
import com.mycustomer.MyCustomer.CustomerDAO;
import com.mycustomer.MyCustomer.CustomerDAOImpl;

public class CustomerServiceImpl implements CustomerService {
	static Logger logger=Logger.getLogger("com.mycompany.jdbcmaven.CustomerServiceImpl");
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
		logger.info("got dao");
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> findById(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findById(uId);
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	@Override
	public Customer updateCustomer(Customer customer,String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer,uId);
	}

	@Override
	public List<Customer> findByLastName(String lName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(String uId) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}