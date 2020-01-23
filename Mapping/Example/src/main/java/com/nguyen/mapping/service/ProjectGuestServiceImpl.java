package com.nguyen.mapping.service;

import com.nguyen.mapping.entity.Guest;
import com.nguyen.mapping.entity.Project;
import com.nguyen.mapping.entity.ProjectGuest;
import com.nguyen.mapping.entity.customID.ProjectGuestID;
import com.nguyen.mapping.repository.ProjectGuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service(value = "projectGuestService")
public class ProjectGuestServiceImpl implements ProjectGuestService {

    private ProjectGuestRepository projectGuestRepository;

    public ProjectGuestServiceImpl(@Autowired ProjectGuestRepository projectGuestRepository) {
        this.projectGuestRepository = projectGuestRepository;
    }

    @Override
    public List<Guest> findByProject(Project project) {
        List<ProjectGuest> projectGuests =
                projectGuestRepository.findByProject(project);

        return projectGuests.stream().
                map(ProjectGuest::getGuest).
                collect(Collectors.toList());
    }

    @Override
    public List<Project> findByGuest(Guest guest) {
        List<ProjectGuest> projectGuests =
                projectGuestRepository.findByGuest(guest);

        return projectGuests.stream().
                map(ProjectGuest::getProject).
                collect(Collectors.toList());
    }

    @Override
    public ProjectGuest findByID(ProjectGuestID id) {
        Optional<ProjectGuest> optionalProjectGuest =
                projectGuestRepository.findById(id);
        return optionalProjectGuest.orElse(null);
    }

    @Override
    public ProjectGuest saveProjectGuest(ProjectGuest projectGuest) {
        return projectGuestRepository.save(projectGuest);
    }
}
