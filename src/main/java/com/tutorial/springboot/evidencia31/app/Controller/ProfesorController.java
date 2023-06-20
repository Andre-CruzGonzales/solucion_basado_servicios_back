package com.tutorial.springboot.evidencia31.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.springboot.evidencia31.app.Entity.Profesor;
import com.tutorial.springboot.evidencia31.app.Service.ProfesorService;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {
	
	@Autowired
	private ProfesorService profesorService;
	@GetMapping
	public ResponseEntity<List<Profesor>> all(){
		List profesores=profesorService.all();
		if(profesores.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(profesores);
	}
}
