package com.gemasu.domain;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@JsonIgnoreProperties(ignoreUnknown=true)
@Entity
public class Activity {

	@Id
	@GeneratedValue
	public int id;
	
	@ManyToOne
	@JoinColumn(name = "projectId")
	@JsonProperty(access = Access.WRITE_ONLY)
	public Project project;

	private String name;
	
	public Activity() {
		
	}
	
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

	
	

}
