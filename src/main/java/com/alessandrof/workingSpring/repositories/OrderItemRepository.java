package com.alessandrof.workingSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrof.workingSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
