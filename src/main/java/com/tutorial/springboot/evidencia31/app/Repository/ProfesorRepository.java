package com.tutorial.springboot.evidencia31.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.springboot.evidencia31.app.Entity.Profesor;


@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long>{

}
