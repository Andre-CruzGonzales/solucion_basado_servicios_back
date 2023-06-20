package com.tutorial.springboot.evidencia31.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.springboot.evidencia31.app.Entity.Curso;
import com.tutorial.springboot.evidencia31.app.Service.CursoService;

@RestController
@RequestMapping(value = "/curso")
public class CursoController {
	@Autowired
	private CursoService cursoService;
	
	@GetMapping
	public ResponseEntity<List<Curso>> all(){
		List<Curso> cursos=cursoService.all();
		if(cursos.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(cursos);
	}
}
