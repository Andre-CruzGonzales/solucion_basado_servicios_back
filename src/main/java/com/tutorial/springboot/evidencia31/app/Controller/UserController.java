package com.tutorial.springboot.evidencia31.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.springboot.evidencia31.app.Entity.Profesor;
import com.tutorial.springboot.evidencia31.app.Entity.User;
import com.tutorial.springboot.evidencia31.app.Service.ProfesorService;
import com.tutorial.springboot.evidencia31.app.Service.UserService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private ProfesorService profesorService;
	@PostMapping
	public User create(@RequestBody User u) {
		//User nuevo = userService.create(u);
		User nuevo = userService.create(u);
		return nuevo;
	}
	@PostMapping(value = "login")
	public User findByUsername(String username){
		
		User seach = userService.findByEmail(username);
		return seach;
	}
	
}
