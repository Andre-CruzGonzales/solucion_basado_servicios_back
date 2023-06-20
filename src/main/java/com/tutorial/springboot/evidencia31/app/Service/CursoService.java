package com.tutorial.springboot.evidencia31.app.Service;

import java.util.List;

import com.tutorial.springboot.evidencia31.app.Entity.Curso;
import com.tutorial.springboot.evidencia31.app.Entity.Profesor;



public interface CursoService {
	public List<Curso> all();
	public Curso findById(Long id);
	public Curso create(Curso c);
	public Curso update(Curso c);
	public Curso delete(Curso c);
	public List<Curso> findByProfesor(Profesor p);

}
