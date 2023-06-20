package com.tutorial.springboot.evidencia31.app.Service;

import java.util.List;

import com.tutorial.springboot.evidencia31.app.Entity.Profesor;



public interface ProfesorService {
	public List<Profesor> all();
	public Profesor findById(Long id);
	public Profesor create(Profesor p);
	public Profesor update(Profesor p);
	public Profesor delete(Profesor p);
	
}
