package com.anataarisa.pimtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anataarisa.pimtool.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Number> {

}
