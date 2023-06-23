package com.tutorial.springboot.evidencia31.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.springboot.evidencia31.app.Entity.Curso;
import com.tutorial.springboot.evidencia31.app.Service.CursoService;

@CrossOrigin(origins = "*")
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
	@GetMapping(value="/{id}")
	public ResponseEntity<Curso> findById(@PathVariable("id") Long id){
		Curso curso = cursoService.findById(id);
		if(curso==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(curso);
	}
	
	@PostMapping
	public ResponseEntity<Curso> create(@RequestBody Curso c){
		c.setEstado(0);
		Curso nuevo = cursoService.create(c);
		return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
	}
	@PutMapping(value="/{id}")
	public ResponseEntity<Curso> update(@PathVariable Long id,@RequestBody Curso c){
		c.setId(id);
		Curso cursoUpdate = cursoService.update(c);
		if(cursoUpdate==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(cursoUpdate);
	}
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Curso> delete(@PathVariable Long id){
		Curso curso = cursoService.delete(id);
		if(curso==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(curso);
		
	}
}
