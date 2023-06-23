package com.tutorial.springboot.evidencia31.app.Service;

import java.util.Optional;

import com.tutorial.springboot.evidencia31.app.Entity.User;

public interface UserService {
	public User create(User u);
	public User findByEmail(String email);
	
}
