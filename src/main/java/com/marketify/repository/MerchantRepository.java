package com.marketify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketify.entities.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant,Integer>{
    
}
