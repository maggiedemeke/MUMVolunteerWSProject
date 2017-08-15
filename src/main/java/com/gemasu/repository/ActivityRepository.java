package com.gemasu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gemasu.domain.Activity;
import com.gemasu.domain.Project;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
	public List<Activity> findByProjectId(Project p);
}
