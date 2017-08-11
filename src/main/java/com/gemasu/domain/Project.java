package com.gemasu.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	private String id;
	private String name;
	private Date StartDate;
	private Date endDate;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
