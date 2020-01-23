package com.nguyen.mapping.repository;

import com.nguyen.mapping.entity.Department;
import com.nguyen.mapping.entity.Employment;
import com.nguyen.mapping.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmploymentRepository extends JpaRepository<Employment, Integer> {

    List<Employment> findByDepartment_Id(Integer id);
    List<Employment> findByDepartment(Department department);
    List<Employment> findByProjects(Project project);
}
