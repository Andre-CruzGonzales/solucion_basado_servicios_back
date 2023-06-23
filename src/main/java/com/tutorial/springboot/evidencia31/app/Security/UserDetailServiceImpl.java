package com.tutorial.springboot.evidencia31.app.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tutorial.springboot.evidencia31.app.Entity.User;
import com.tutorial.springboot.evidencia31.app.Repository.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User usuario = userRepository.findByOneUsername(username)
				.orElseThrow(()-> new UsernameNotFoundException("El usuario con username "+username+"no existe"));
		
		return new UserDetailsImpl(usuario); 
	}
}
