package com.gemasu.domain;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

@Entity
public class Activity {


	@Id
	@GeneratedValue
public int id;
	
	public String name;
	
	@ManyToOne
	@JoinColumn(name = "projectid")
	public Project project;
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", project=" + project + ", name=" + name + "]";
	}

	public Activity() {
		
	}
	

}
