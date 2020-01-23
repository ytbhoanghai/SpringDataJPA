package com.nguyen.mapping.service;

import com.nguyen.mapping.entity.Department;
import com.nguyen.mapping.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository repository;

    public DepartmentServiceImpl(@Autowired DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Department findByName(String name) {
        return repository.findByName(name);
    }
}
