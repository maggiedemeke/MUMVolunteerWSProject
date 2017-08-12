package com.gemasu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gemasu.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
