package com.mycompexample.springjdbcdemo.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompexample.springjdbcdemo.model.Customer;

@Component("dao")

public class CustomerDaoImpl implements CustomerDao2 {
	private DataSource dataSource;
	private Connection connection;
	private PreparedStatement pStatement;
private static Logger logger=Logger.getLogger("com.mycompany.springjdbcdemo.dao.CustomerDaoImpl");
	@Autowired
	public CustomerDaoImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
@PostConstruct
public void init()
{
	try {
		logger.info("creating connection");
		connection=dataSource.getConnection();
		logger.info("connection established.");
	} catch (SQLException e) {
		
		e.printStackTrace();
		logger.info("connection unsuccesfull.");
	}
}
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		pStatement=connection.prepareStatement("insert into customer(uid,firstname,lastname,email) values(?,?,?,?)");
		pStatement.setString(1, customer.getUid());
		pStatement.setString(2, customer.getFirstName());
		pStatement.setString(3, customer.getLastName());
		pStatement.setString(4, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}
	@Override
	public List<Customer> getAllCustomers() throws SQLException 
	{
		DatabaseMetaData mData=connection.getMetaData();
		ResultSet rs=mData.getTables(null, null, "EMPLOYEES", null);
		if(rs.next())
		{
			System.out.println("table exists");
		}
		else {
			System.out.println("table does not exists");
		}
		pStatement=connection.prepareStatement("select uid,firstname,"
				+ "lastname,email from"
				+ " customer");
		
		ResultSet rSet=pStatement.executeQuery();
		List<Customer> list=new ArrayList<Customer>();
		while(rSet.next())
		{
			Customer customer=new Customer(rSet.getString("uid"),
					rSet.getString("firstname"), rSet.getString("lastname"), 
					rSet.getString("email"));
			list.add(customer);
		}
		return list;

	}
	@Override
	public int deleteCustomer(String uid) throws SQLException {
		pStatement =connection.prepareStatement("delete from customer where uid=?");
		pStatement.setString(1, uid);
	    pStatement.executeUpdate();
	    
	    return 0;
		
	}
	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
		pStatement=connection.prepareStatement("select uid,firstname,"
				+ "lastname,email from"
				+ " customer where uid=?");
		pStatement.setString(1, uId);
		ResultSet rSet=pStatement.executeQuery();
		List<Customer> list=new ArrayList<Customer>();
		while(rSet.next())
		{
			Customer customer=new Customer(rSet.getString("uid"),
					rSet.getString("firstname"), rSet.getString("lastname"), 
					rSet.getString("email"));
			list.add(customer);
		}
		return list;
	}
	@Override
	public int updateCustomerById(Customer customer) throws SQLException {
		pStatement=connection.prepareStatement("update customer "
				+ "set firstname=? , "
				+ "lastname=?, "
				+ "email=?"
				+ " where uid=?");
		pStatement.setString(1, customer.getFirstName());
		pStatement.setString(2, customer.getLastName());
		pStatement.setString(3, customer.getEmail());
		pStatement.setString(4, customer.getUid());
		pStatement.executeUpdate();
		return 1;
	}
	
	

}