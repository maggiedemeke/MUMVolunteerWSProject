package com.gemasu.service;

import java.util.ArrayList;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemasu.domain.Project;
import com.gemasu.domain.Status;
import com.gemasu.repository.ProjectRepository;



@Service
@Transactional 
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	
	
	public List<Project> getAllProjects(){
		List<Project> projects = new ArrayList<Project>();
		projectRepository.findAll()
		.forEach(projects::add);
		return projects;
			
	}
	public List<Project> getAllActiveProjects(Status status){
		List<Project> projects = new ArrayList<Project>();
		projects = projectRepository.findByStatus(status);
		return projects;
	}
	
	
	
	public void saveProject(Project project){
		projectRepository.save(project);
	}
	public void UpdateProject(int id ,Project project){
		projectRepository.save(project);
		
		
	}
/*	public void inActivateProject(Project project){
		
	}*/
	
	public Project getProject(int id){
		Project project = new Project();
		project = projectRepository.findOne(id);
		return project;
	}
	
	public void deleteProject(int id){
		projectRepository.delete(id);
	}
	

}
