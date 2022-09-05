package com.rsk.springdatajpa.single_table_strategy.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsk.springdatajpa.single_table_strategy.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
 
}
