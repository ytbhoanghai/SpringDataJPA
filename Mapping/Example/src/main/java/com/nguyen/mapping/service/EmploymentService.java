package com.nguyen.mapping.service;

import com.nguyen.mapping.entity.Department;
import com.nguyen.mapping.entity.Employment;
import com.nguyen.mapping.entity.Project;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmploymentService {

    Employment saveEmployment(Employment employment);
    Employment findById(Integer id);
    List<Employment> findByDepartment_Id(Integer id);
    List<Employment> findByDepartment(Department department);
    List<Employment> findByProjects(Project project);
}
