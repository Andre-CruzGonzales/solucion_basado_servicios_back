package com.tutorial.springboot.evidencia31.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.springboot.evidencia31.app.Entity.Curso;
import com.tutorial.springboot.evidencia31.app.Entity.Profesor;


@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
	public List<Curso> findByProfesor(Profesor p);
	
}
