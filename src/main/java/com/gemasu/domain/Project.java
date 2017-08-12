package com.gemasu.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Project {
	@Id @GeneratedValue
	private int id;
	
	private int maxNumOfMemebers;
	
	private String name;
	@Temporal(TemporalType.DATE)
	private Date StartDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	@ManyToMany
	private Collection<User>user = new ArrayList<User>();
	@OneToMany(mappedBy ="project")
	private Collection<Activity>activities = new ArrayList<Activity>();
	@ManyToOne
	@JoinColumn(name="organizationId")
	private Organization organization;
	@Enumerated 
	private Category category;
	@Enumerated 
	private Status status;
	
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
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	public Collection<User> getUser() {
		return user;
	}
	public void setUser(Collection<User> user) {
		this.user = user;
	}
	public Collection<Activity> getActivities() {
		return activities;
	}
	public void setActivities(Collection<Activity> activities) {
		this.activities = activities;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public int getMaxNumOfMemebers() {
		return maxNumOfMemebers;
	}
	public void setMaxNumOfMemebers(int maxNumOfMemebers) {
		this.maxNumOfMemebers = maxNumOfMemebers;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Project() {
		super();
		
	}
	
		
}
	
	



