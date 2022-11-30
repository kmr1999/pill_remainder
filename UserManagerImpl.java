package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
@Service
public class UserManagerImpl implements UserManager {
	@Autowired
	UserRepository repository;
	public void addUser(User u) {
		repository.save(u);	
		
	}
	
	@Override
	public User getUserbyMail(String email) {
		return repository.getUserById(email);
	}

	@Override
	public void putUser(User u) {
		repository.putUser(u.getPassword(),u.getEmail());
		
	}
	
	
	
}
