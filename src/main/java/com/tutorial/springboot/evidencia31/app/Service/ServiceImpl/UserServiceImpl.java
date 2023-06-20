package com.tutorial.springboot.evidencia31.app.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.springboot.evidencia31.app.Entity.Curso;
import com.tutorial.springboot.evidencia31.app.Entity.User;
import com.tutorial.springboot.evidencia31.app.Repository.UserRepository;
import com.tutorial.springboot.evidencia31.app.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User create(User u) {
		
		User nuevo = userRepository.save(u);
		return nuevo;
	}
	
}
