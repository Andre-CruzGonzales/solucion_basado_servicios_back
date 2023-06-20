package com.tutorial.springboot.evidencia31.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.springboot.evidencia31.app.Entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
