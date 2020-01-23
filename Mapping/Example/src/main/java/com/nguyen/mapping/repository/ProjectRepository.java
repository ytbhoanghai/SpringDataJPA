package com.nguyen.mapping.repository;

import com.nguyen.mapping.entity.Employment;
import com.nguyen.mapping.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

    List<Project> findByEmployments(Employment employment);
}
