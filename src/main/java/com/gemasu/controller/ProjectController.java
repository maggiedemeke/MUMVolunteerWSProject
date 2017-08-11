package com.gemasu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gemasu.domain.Project;
import com.gemasu.service.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	/*
	 * Create
	 */
	@PostMapping
	public void create(Project project){
		projectService.saveProject(project);
	}

}
