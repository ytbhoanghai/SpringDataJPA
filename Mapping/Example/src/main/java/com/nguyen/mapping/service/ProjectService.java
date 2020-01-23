package com.nguyen.mapping.service;


import com.nguyen.mapping.entity.Employment;
import com.nguyen.mapping.entity.Project;

import java.util.List;

public interface ProjectService {

    Project findById(Integer id);
    List<Project> findByEmployments(Employment employment);
}
