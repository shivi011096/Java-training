package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;

public interface UserService {
	
	public User createUser(User user);
	public List<User> getAllUsers();
	public Optional<User> getUserById(Integer id);

}
