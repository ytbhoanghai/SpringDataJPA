package com.nguyen.mapping.service;

import com.nguyen.mapping.entity.Guest;
import com.nguyen.mapping.entity.Project;
import com.nguyen.mapping.entity.ProjectGuest;
import com.nguyen.mapping.entity.customID.ProjectGuestID;

import java.util.List;

public interface ProjectGuestService {

    List<Guest> findByProject(Project project);
    List<Project> findByGuest(Guest guest);
    ProjectGuest findByID(ProjectGuestID id);
    ProjectGuest saveProjectGuest(ProjectGuest projectGuest);
}
