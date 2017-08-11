package com.gemasu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gemasu.domain.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {

}
