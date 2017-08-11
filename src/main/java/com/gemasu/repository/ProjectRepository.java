package com.gemasu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gemasu.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
