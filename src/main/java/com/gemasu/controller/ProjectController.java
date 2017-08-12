package com.gemasu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gemasu.domain.Project;
import com.gemasu.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	ProjectService projectService;

	/*
	 * Create
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void create(@RequestBody Project project) {
		projectService.saveProject(project);
	}
@RequestMapping("/{id}")
	public Project getProject(@PathVariable int id) {
		Project project = projectService.getProject(id);
		return project;
	}

@RequestMapping("/")
public List<Project> getAllProjects()
{  List<Project> projects = new ArrayList<Project>();
	projects =projectService.getAllProjects();
	return projects;
}
@RequestMapping("/delete/{id}")
public void deleteProject(@PathVariable int id){
	

	projectService.deleteProject(id);
}
}

