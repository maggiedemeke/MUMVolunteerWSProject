package com.gemasu.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gemasu.domain.Project;
import com.gemasu.domain.User;
import com.gemasu.repository.UserRepository;
import com.gemasu.service.ProjectService;
import com.gemasu.service.SenderService;
import com.gemasu.service.UserService;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	ProjectService projectService;
	@Autowired
	UserService userService;
	@Autowired
	SenderService senderService;

	/*
	 * Create
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void create(@RequestBody Project project) {
		senderService.send("boot.q", "There is a new project created");
		projectService.saveProject(project);
	}

	@RequestMapping("/{id}")
	public Project getProject(@PathVariable int id) {
		Project project = projectService.getProject(id);
		return project;
	}

	@RequestMapping("/")
	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<Project>();
		projects = projectService.getAllProjects();
		return projects;
	}

	@RequestMapping("/delete/{id}")
	public void deleteProject(@PathVariable int id) {

		projectService.deleteProject(id);
	}
	
	@RequestMapping("/user/{id}")
	public List<Project> getByUser(@PathVariable int id){
		List<User> users = new ArrayList<>();
		users.add(userService.getUserById(id));
		return projectService.getByUser(users);
	}
	
	@RequestMapping("/usersinproject/{id}")
	public Collection <User> getAllUsers(@PathVariable int id){
		Collection <User>users =  projectService.getAllUsersInProject(id);
		return users;
			
		
	}
	@RequestMapping("/success/{id}")
	public String UserRegisteredForProject(@PathVariable int id, User user) {
		//Project project = projectService.getProject(id);
		return "SuccessFulApplication";
	}
	}
