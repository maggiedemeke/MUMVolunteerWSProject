package com.gemasu.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gemasu.domain.Activity;
import com.gemasu.repository.ActivityRepository;

public class ActivityService {
	@Autowired
	ActivityRepository activityRepository;
	
	public void saveActivity(Activity activity){
		activityRepository.save(activity);
		
		
	}

	public void updateActivity(){
		
		
	}
	public void removeActivity(){
		
		
	}
}
