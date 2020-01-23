package com.nguyen.mapping.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@ToString(exclude = "employments")
@Entity
public class Project {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_project")
    private Integer id;

    private String name;

    @ManyToMany
    @JoinTable(name = "employment_project",
            joinColumns = @JoinColumn(name = "id_project"),
            inverseJoinColumns = @JoinColumn(name = "id_employment"))
    private List<Employment> employments;

    public Project(String name) {
        this.name = name;
    }
}
