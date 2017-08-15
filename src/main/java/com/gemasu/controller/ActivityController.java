package com.gemasu.controller;




import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gemasu.domain.Activity;
import com.gemasu.domain.Project;
import com.gemasu.service.ActivityService;
import com.gemasu.service.ProjectService;

@Controller 
@RequestMapping("/activity")
public class ActivityController {
	
	@Autowired 
	ActivityService activityService;
    @Autowired
    ProjectService projectService;
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void create(Activity activity){
		activityService.saveActivity(activity);
	}
	
	

	
	
	@PutMapping
	public void update(Activity activity){
		
	}
	
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void delete(Activity activity){
		
	}

	@RequestMapping("/projectactivity/{id}")
	public List<Activity> getAllActivities(@PathVariable int id) {
		Project project = projectService.getProject(id);
		List<Activity> activities = activityService.getAllActivities(project);
			return activities;
	}


	public ActivityController() {
		
	}
	
	
	

}
