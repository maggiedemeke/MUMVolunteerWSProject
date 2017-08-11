package com.gemasu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemasu.domain.Organization;
import com.gemasu.repository.OrganizationRepository;

@Service
public class OrganizationService {

	@Autowired
	OrganizationRepository organizationRepository;
	
	public void save(Organization organization) {
		organizationRepository.save(organization);
	}
	
	public void delete(Organization organization) {
		organizationRepository.delete(organization);
	}
	
	public void update(Organization organization){
		organizationRepository.save(organization);
	}
	
	public Organization getById(Integer id) {
		return organizationRepository.findOne(id);
	}
	
	public List<Organization> getAll() {
		return organizationRepository.findAll();
	}
	
}
