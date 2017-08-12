package com.gemasu.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gemasu.domain.Activity;
import com.gemasu.service.ActivityService;

@RestController 
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
	@RequestMapping("/delete/{id}")
	public void delete(Activity activity){
		
	}
	
	@GetMapping
	@RequestMapping("/{id}")
	public void readActivity(Activity activity){
		
	}
	
	
	

}
