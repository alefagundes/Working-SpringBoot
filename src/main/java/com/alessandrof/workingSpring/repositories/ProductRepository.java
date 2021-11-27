package com.alessandrof.workingSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrof.workingSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
