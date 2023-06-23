package com.tutorial.springboot.evidencia31.app.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.springboot.evidencia31.app.Entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public Optional<User> findByOneUsername(String username);
}
