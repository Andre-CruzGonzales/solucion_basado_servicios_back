package com.tutorial.springboot.evidencia31.app;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.tutorial.springboot.evidencia31.app.Entity.Curso;
import com.tutorial.springboot.evidencia31.app.Entity.Profesor;
import com.tutorial.springboot.evidencia31.app.Repository.CursoRepository;

@DataJpaTest
public class CursoRepositoryMockTest {
	@Autowired
	private CursoRepository cursoRepository;
	
	@Test
	public void whenSave_thenReturnEntity() {
		Profesor p =  new Profesor();
		p.setId(1L);
		Curso curso = new Curso();
		curso.setNombre("Curso de test");
		curso.setDescripcion("descricpion del testing");
		curso.setEstado(0);
		
		curso.setProfesor(p);
		
		Curso nuevo =cursoRepository.save(curso);
		
		
		Assertions.assertThat(nuevo!=null).isEqualTo(false);
	}
}
