package com.gemasu.controller;




import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController 
@RequestMapping("/activity")
public class ActivityController {
	
	@Autowired 
	ActivityService activityService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void create(Activity activity){
		activityService.saveActivity(activity);
	}
	
	
	@RequestMapping("/{id}")
	public Activity getActivity(@PathVariable int id) {
		Activity activity = activityService.getActivity(id);
		return activity;
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
		List<Activity> activities = activityService.getAllActivities(id);
			return activities;
	}
	
	
	

}
