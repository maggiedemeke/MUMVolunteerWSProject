package com.gemasu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gemasu.domain.Organization;
import com.gemasu.domain.OrganizationStatus;
import com.gemasu.domain.Project;
import com.gemasu.service.OrganizationService;
import com.gemasu.service.SenderService;

@RestController
@RequestMapping("/organization")
public class OrganizationController {
	@Autowired
	OrganizationService organizationService;
	
	@Autowired
	private SenderService senderService;
	
	@PostMapping
	@RequestMapping("/create")
	public void create(@RequestBody Organization organization) {
		System.out.println("ORG: " + organization);
		List<Project> projects = new ArrayList<>();
		organization.setProjects(projects);
		organizationService.save(organization);
	}
	
	@GetMapping
	@RequestMapping("/status/{status}")
	public List<Organization> getAllByStatus(@PathVariable OrganizationStatus status) {
		return organizationService.getByStatus(status);
	}
	
	@GetMapping
	@RequestMapping("/")
	public List<Organization> getAll() {
		senderService.send("boot.q", "Hello Boot!");
		return organizationService.getAll();
	}
	
	@GetMapping
	@RequestMapping("/{id}")
	public Organization getById(@PathVariable Integer id) {
		return organizationService.getById(id);
	}
	
	@PostMapping
	@RequestMapping("/update")
	public void update(@RequestBody Organization organization) {
		System.out.println("ORG: " + organization);
		Organization newOrg = new Organization();
		newOrg = organizationService.getById(organization.getId());
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
