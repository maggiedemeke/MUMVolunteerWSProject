package com.gemasu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemasu.domain.Activity;
import com.gemasu.domain.Project;
import com.gemasu.repository.ActivityRepository;

@Service
public class ActivityService {
	
	public ActivityService() {
	
	}

	@Autowired
	ActivityRepository activityRepository;

	public void saveActivity(Activity activity) {
		activityRepository.save(activity);

	}

	public Activity getActivity(int id) {
		
		Activity activity = activityRepository.getOne(id);
		System.out.println("ACT: " + activity);
		return activity;

	}

	public void updateActivity(int id, Activity activity) {
		activityRepository.save(activity);

	}

	public void removeActivity(Activity activity) {
		activityRepository.delete(activity);

	}

	public List<Activity> getAllActivities(Project p) {
		
		List<Activity> activities = new ArrayList<Activity>();
		activities = activityRepository.findByProjectId(p);
		return activities;
	}


}
