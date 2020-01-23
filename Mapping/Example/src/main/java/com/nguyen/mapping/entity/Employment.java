package com.nguyen.mapping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@ToString(exclude = "projects")
@Entity
public class Employment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employment")
    private Integer id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_account", unique = true)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "id_department")
    private Department department;

    @ManyToMany(mappedBy = "employments")
    private List<Project> projects;

    public Employment(String name, Account account) {
        this.name = name;
        this.account = account;
    }
}
