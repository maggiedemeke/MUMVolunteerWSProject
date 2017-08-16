package com.gemasu.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gemasu.domain.Activity;
import com.gemasu.domain.Project;

@Transactional
public interface ActivityRepository extends JpaRepository<Activity, Integer> {
	public List<Activity> findByProject(Project project);
	
	public void removeById(int id);
}
