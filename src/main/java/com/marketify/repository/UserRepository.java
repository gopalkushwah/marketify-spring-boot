package com.marketify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketify.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    
}
