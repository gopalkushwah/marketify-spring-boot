package com.marketify.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketify.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    
}
