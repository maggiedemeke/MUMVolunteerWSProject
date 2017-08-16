package com.gemasu.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemasu.domain.Activity;
import com.gemasu.domain.Project;
import com.gemasu.repository.ActivityRepository;

@Service
@Transactional
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

	public void removeActivityById(int id) {
		activityRepository.delete(getActivity(id));
	}
	
	public void removeActivity(Activity activity) {
		activityRepository.delete(activity);
	}

	public List<Activity> getAllActivities(Project project) {
		List<Activity> activities = new ArrayList<Activity>();
		activities = activityRepository.findByProject(project);
		return activities;
	}

}
