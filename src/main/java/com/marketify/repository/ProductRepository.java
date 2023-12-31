package com.marketify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketify.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
