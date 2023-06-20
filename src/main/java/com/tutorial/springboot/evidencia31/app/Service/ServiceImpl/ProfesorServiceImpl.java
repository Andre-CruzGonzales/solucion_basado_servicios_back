package com.tutorial.springboot.evidencia31.app.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.springboot.evidencia31.app.Entity.Profesor;
import com.tutorial.springboot.evidencia31.app.Repository.ProfesorRepository;
import com.tutorial.springboot.evidencia31.app.Service.ProfesorService;

@Service
public class ProfesorServiceImpl implements ProfesorService{

	@Autowired
	private ProfesorRepository profesorRepository;
	@Override
	public List<Profesor> all() {
		return (List<Profesor>)profesorRepository.findAll();
	}

	@Override
	public Profesor findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesor create(Profesor p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesor update(Profesor p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesor delete(Profesor p) {
		// TODO Auto-generated method stub
		return null;
	}

}
