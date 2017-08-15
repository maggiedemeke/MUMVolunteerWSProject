package com.gemasu.controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gemasu.domain.Activity;
import com.gemasu.service.ActivityService;
import com.gemasu.service.ProjectService;

@RestController
@RequestMapping("/activity")
public class ActivityController {
	
	@Autowired 
	ActivityService activityService;
	
	@Autowired 
	ProjectService projectService;
	

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void create(@RequestBody Activity activity){
		System.out.println("WS Activity Create: " + activity);
		activityService.saveActivity(activity);
	}
	
	
	@PutMapping
	public void update(Activity activity){
		
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Integer id){
		activityService.removeActivityById(id);
	}

	@RequestMapping("/projectactivity/{id}")
	public List<Activity> getAllActivities(@PathVariable int id) {
		System.out.println("Activities by Project");
		List<Activity> activities = activityService.getAllActivities(projectService.getProject(id));
		return activities;
	}


	public ActivityController() {
		
	}
	
	
	

}
