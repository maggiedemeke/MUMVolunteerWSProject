package com.gemasu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gemasu.domain.Organization;
import com.gemasu.domain.OrganizationStatus;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
	public List<Organization> findByStatusOrderByName(OrganizationStatus status);
}
