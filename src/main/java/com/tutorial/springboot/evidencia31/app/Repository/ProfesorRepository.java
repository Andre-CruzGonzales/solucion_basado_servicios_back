package com.tutorial.springboot.evidencia31.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.springboot.evidencia31.app.Entity.Profesor;



public interface ProfesorRepository extends JpaRepository<Profesor, Long>{

}
