package com.gemasu.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gemasu.domain.Organization;
import com.gemasu.domain.Project;
import com.gemasu.domain.Status;
import com.gemasu.domain.User;



public interface ProjectRepository extends JpaRepository<Project, Integer> {
	public List<Project>findByStatus(Status status);
	
	public List<Project> findByUser(List<User> users);
	
	public List<Project> findByOrganization(Organization organization);

}
