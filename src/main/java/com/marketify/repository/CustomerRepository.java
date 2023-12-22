package com.marketify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketify.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

} 
