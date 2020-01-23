package com.nguyen.mapping.service;

import com.nguyen.mapping.entity.Department;

public interface DepartmentService {

    Department findByName(String name);
}
