package com.gemasu.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemasu.domain.Project;
import com.gemasu.repository.ProjectRepository;

@Service
@Transactional 
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	public void saveProject(Project project){
		projectRepository.save(project);
	}
	public void UpdateProject(Project project){
		
		
	}
	public void inActivateProject(Project project){
		
	}
	
	

}
