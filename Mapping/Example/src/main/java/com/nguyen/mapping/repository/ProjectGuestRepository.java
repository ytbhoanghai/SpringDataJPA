package com.nguyen.mapping.repository;

import com.nguyen.mapping.entity.Guest;
import com.nguyen.mapping.entity.Project;
import com.nguyen.mapping.entity.ProjectGuest;
import com.nguyen.mapping.entity.customID.ProjectGuestID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectGuestRepository extends JpaRepository<ProjectGuest, ProjectGuestID> {

    List<ProjectGuest> findByProject(Project project);
    List<ProjectGuest> findByGuest(Guest guest);
}
