package com.gemasu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemasu.domain.User;
import com.gemasu.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	/*
	 * Retrieve one user by id
	 * 
	 * @param 	id 	User id
	 * @return 	User Object user
	 */
	public User getUserById(Integer id) {
		return userRepository.getOne(id);
	}
	public User getUserByUserName(String name){
		return userRepository.findByUsername(name);
	}
}
