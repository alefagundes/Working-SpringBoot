package com.alessandrof.workingSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrof.workingSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
