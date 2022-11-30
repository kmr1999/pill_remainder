package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface UserManager {
	void addUser(User u);

	User getUserbyMail(String email);

	void putUser(User u);
	
	
}
