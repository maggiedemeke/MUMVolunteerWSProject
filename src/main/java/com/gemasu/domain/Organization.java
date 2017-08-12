package com.gemasu.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Organization {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToMany(mappedBy="organization")
	private List<Project> projects = new ArrayList<>();
	@Enumerated(EnumType.STRING)
	OrganizationStatus status;
	
	
	public Organization() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public OrganizationStatus getStatus() {
		return status;
	}

	public void setStatus(OrganizationStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", projects=" + projects + ", status=" + status + "]";
	}

	
	
	
	
}
