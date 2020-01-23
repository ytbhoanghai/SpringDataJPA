package com.nguyen.mapping.service;

import com.nguyen.mapping.entity.Department;
import com.nguyen.mapping.entity.Employment;
import com.nguyen.mapping.entity.Project;
import com.nguyen.mapping.repository.EmploymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "employmentService")
public class EmploymentServiceImpl implements EmploymentService {

    private EmploymentRepository repository;

    public EmploymentServiceImpl(@Autowired EmploymentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employment saveEmployment(Employment employment) {
        return repository.save(employment);
    }

    @Override
    public Employment findById(Integer id) {
        Optional<Employment> optionalEmployment = repository.findById(id);
        return optionalEmployment.orElse(null);
    }

    @Override
    public List<Employment> findByDepartment_Id(Integer id) {
        return repository.findByDepartment_Id(id);
    }

    @Override
    public List<Employment> findByDepartment(Department department) {
        return repository.findByDepartment(department);
    }

    @Override
    public List<Employment> findByProjects(Project project) {
        return repository.findByProjects(project);
    }
}
