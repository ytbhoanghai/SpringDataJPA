package com.nguyen.mapping.entity.customID;


import com.nguyen.mapping.entity.Guest;
import com.nguyen.mapping.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ProjectGuestID implements Serializable {

    private Integer idProject;
    private Integer idGuest;

    public static ProjectGuestID createID(Project project, Guest guest) {
        return new ProjectGuestID(project.getId(), guest.getId());
    }
}
