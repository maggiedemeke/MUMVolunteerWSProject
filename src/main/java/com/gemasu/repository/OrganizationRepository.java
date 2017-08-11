package com.gemasu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gemasu.domain.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

}
