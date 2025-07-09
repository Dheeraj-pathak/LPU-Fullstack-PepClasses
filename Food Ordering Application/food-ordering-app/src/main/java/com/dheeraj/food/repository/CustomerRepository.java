package com.dheeraj.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dheeraj.food.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
