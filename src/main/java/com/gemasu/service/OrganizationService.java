package com.gemasu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemasu.domain.Organization;
import com.gemasu.domain.OrganizationStatus;
import com.gemasu.repository.OrganizationRepository;

@Service
public class OrganizationService {

	@Autowired
	OrganizationRepository organizationRepository;
	
	/*
	 * Save Organization
	 * 
	 * @param 	Organization Domain entity
	 * @return 	void
	 */
	public void save(Organization organization) {
		organizationRepository.save(organization);
	}
	
	/*
	 * Update Organization
	 * 
	 * @param 	Organization Domain entity
	 * @return 	void
	 */
	public void update(Organization organization){
		organizationRepository.save(organization);
	}
	
	/*
	 * Retrieve one organization by id
	 * 
	 * @param 	id 	Id ot the Organization
	 * @return 	Organization
	 */
	public Organization getById(Integer id) {
		return organizationRepository.findOne(id);
	}
	
	/*
	 * Get all organizations
	 * 
	 * @return 	List<Organization>	Collection of organizations
	 */
	public List<Organization> getAll() {
		return organizationRepository.findAll();
	}
	
	/*
	 * Get organization by status
	 * 
	 * @param 	status	Enum OrganizationStatus
	 * @return 	List<Organization> Collection of organizations
	 */
	public List<Organization> getByStatus(OrganizationStatus status) {
		return organizationRepository.findByStatusOrderByName(status);
	}
	
}
