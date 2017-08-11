package com.gemasu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gemasu.domain.Organization;
import com.gemasu.service.OrganizationService;

@RestController
@RequestMapping("/organization")
public class OrganizationController {
	@Autowired
	OrganizationService organizationService;
	
	@PostMapping
	public void create(Organization organization) {
		organizationService.save(organization);
	}
	
	@GetMapping
	@RequestMapping("/")
	public List<Organization> getAll() {
		return organizationService.getAll();
	}
	
	@GetMapping
	@RequestMapping("/{id}")
	public Organization getById(Integer id) {
		return organizationService.getById(id);
	}
	
	@PutMapping
	public void update(Organization organization, Integer id) {
		Organization newOrg = new Organization();
		newOrg = organizationService.getById(id);
		newOrg.setName(organization.getName());
		organizationService.update(newOrg);
	}
}
