package com.gemasu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gemasu.domain.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
	public List<Activity> findByProject(int id);
}
