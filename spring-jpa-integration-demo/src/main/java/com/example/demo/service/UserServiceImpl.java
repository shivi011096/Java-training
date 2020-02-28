package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@Service
@EnableTransactionManagement

public class UserServiceImpl implements UserService {

	private UserDao DAO;
	
    public UserServiceImpl(UserDao DAO) {
	
    	super();
    	this.DAO = DAO;
	}
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return DAO.save(user);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return DAO.findAll();
	}

	@Override
	@Transactional
	public Optional<User> getUserById(Integer id) {
		// TODO Auto-generated method stub
		return DAO.findById(id);
	}

	
	
	

}
