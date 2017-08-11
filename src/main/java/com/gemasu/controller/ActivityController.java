package com.gemasu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gemasu.domain.Activity;
import com.gemasu.service.ActivityService;

@Controller 
@RequestMapping("/activity")
public class ActivityController {
	@Autowired
	ActivityService activityService;
	
	@PostMapping
	public void create(Activity activity){
		activityService.saveActivity(activity);
	}
	
	@PutMapping
	public void update(Activity activity){
		
	}
	
	@DeleteMapping
	@RequestMapping("/{id}")
	public void delete(Activity activity){
		
	}
	
	@GetMapping
	@RequestMapping("/{id}")
	public void readActivity(Activity activity){
		
	}
	
	
	

}
