package com.gemasu.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gemasu.domain.Project;
import com.gemasu.domain.Status;



public interface ProjectRepository extends JpaRepository<Project, Integer> {
	public List<Project>findByStatus(Status status);

}
