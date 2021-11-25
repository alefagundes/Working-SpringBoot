package com.alessandrof.workingSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrof.workingSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
