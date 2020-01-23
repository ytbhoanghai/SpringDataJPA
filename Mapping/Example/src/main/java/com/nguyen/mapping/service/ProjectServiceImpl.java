package com.nguyen.mapping.service;

import com.nguyen.mapping.entity.Employment;
import com.nguyen.mapping.entity.Project;
import com.nguyen.mapping.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "projectService")
public class ProjectServiceImpl implements ProjectService{

    private ProjectRepository repository;

    public ProjectServiceImpl(@Autowired ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public Project findById(Integer id) {
        Optional<Project> optionalProject = repository.findById(id);
        return optionalProject.orElse(null);
    }

    @Override
    public List<Project> findByEmployments(Employment employment) {
        return repository.findByEmployments(employment);
    }
}
