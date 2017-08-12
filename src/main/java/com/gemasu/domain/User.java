package com.gemasu.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import antlr.collections.List;

@Entity
public class User {
	
	
	@ManyToMany(mappedBy ="projects")
	
	public List projects;
	@Id
	public int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
