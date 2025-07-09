package com.dheeraj.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dheeraj.food.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
