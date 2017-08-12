package com.gemasu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gemasu.domain.Organization;
import com.gemasu.domain.OrganizationStatus;
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
	@RequestMapping("/status/{status}")
	public List<Organization> getAll(OrganizationStatus status) {
		return organizationService.getByStatus(status);
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
	
	@PutMapping
	@RequestMapping("/project/{id}/status/{status}")
	public void updateStatus(Integer id, OrganizationStatus status) {
		Organization newOrg = new Organization();
		newOrg = organizationService.getById(id);
		newOrg.setStatus(status);
		organizationService.update(newOrg);
	}
}