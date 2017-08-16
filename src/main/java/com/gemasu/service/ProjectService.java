package com.gemasu.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemasu.domain.Organization;
import com.gemasu.domain.Project;
import com.gemasu.domain.Status;
import com.gemasu.domain.User;
import com.gemasu.repository.ProjectRepository;



@Service
@Transactional 
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	/*
	 * Retrieve All the projects
	 * 
	 * @return 	List<Project> Collection of projects
	 */
	public List<Project> getAllProjects(){
		List<Project> projects = new ArrayList<Project>();
	/*	List<Project> activeProjects = new ArrayList<Project>();
		projects = projectRepository.findAll();
		for(Project p: projects){
			if(p.getStatus().equals(Status.INPROGRESS)|| p.getStatus().equals(Status.NEW) ){
				activeProjects.add(p);
			}
			
		}*/
		projectRepository.findAll()
		.forEach(projects::add);
		return projects;
		//return activeProjects;	
	}
	
	/*
	 * Retrieve all the projects by Status
	 * 
	 * @param 	status	Enum type 
	 * @return 	List<Project> Collection of projects
	 */
	public List<Project> getAllActiveProjects(Status status){
		List<Project> projects = new ArrayList<Project>();
		projects = projectRepository.findByStatus(status);
		return projects;
	}
	
	public Collection<User> getAllUsersInProject(int id){
		Collection<User> user = new ArrayList<User>();
		
		Project project = getProject(id);
		user = project.getUser();
		return user;
		
	}
	
	
	public Organization getOrganization(int id){
		Project project = getProject(id);
		Organization organization = project.getOrganization();
		return organization;
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
	
	/*
	 * Retrieve the projects by user
	 * 
	 * @param 	users 	List of users
	 * @return 	List<Project> List of Projects
	 */
	public List<Project> getByUser(List<User> users){
		return projectRepository.findByUser(users);
	}
	

}
