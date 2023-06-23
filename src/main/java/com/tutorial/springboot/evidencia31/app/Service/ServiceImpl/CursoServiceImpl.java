package com.tutorial.springboot.evidencia31.app.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.springboot.evidencia31.app.Entity.Curso;
import com.tutorial.springboot.evidencia31.app.Entity.Profesor;
import com.tutorial.springboot.evidencia31.app.Repository.CursoRepository;
import com.tutorial.springboot.evidencia31.app.Service.CursoService;

@Service
public class CursoServiceImpl implements CursoService{
	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public List<Curso> all() {
		return (List<Curso>)cursoRepository.findAll();
	}

	@Override
	public Curso findById(Long id) {
		 return cursoRepository.findById(id).orElse(null);
	}

	@Override
	public Curso create(Curso c) {
		c.setEstado(0);
		Curso nuevo = cursoRepository.save(c);
		return nuevo;
	}

	@Override
	public Curso update(Curso c) {
		Curso cursoDB = findById(c.getId());
		if(cursoDB==null) {
			return null;
		}
		cursoDB.setId(c.getId());
		cursoDB.setNombre(c.getNombre());
		cursoDB.setDescripcion(c.getDescripcion());
		cursoDB.setEstado(c.getEstado());
		cursoRepository.save(cursoDB);
		return cursoDB;
	}

	@Override
	public Curso delete(Long id) {
		Curso cursoDB = findById(id);
		if(cursoDB==null) {
			return null;
		}
		cursoDB.setId(id);
		cursoRepository.deleteById(id);
		return cursoDB;
	}

	@Override
	public List<Curso> findByProfesor(Profesor p) {
		return cursoRepository.findByProfesor(p);
	}

}
