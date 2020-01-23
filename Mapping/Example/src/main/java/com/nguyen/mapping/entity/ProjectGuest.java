package com.nguyen.mapping.entity;

import com.nguyen.mapping.entity.customID.ProjectGuestID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project_guest")
public class ProjectGuest {

    @EmbeddedId
    private ProjectGuestID id;

    @ManyToOne
    @JoinColumn(name = "id_project")
    @MapsId(value = "idProject")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "id_guest")
    @MapsId(value = "idGuest")
    private Guest guest;

    private Date dateSale;

}
