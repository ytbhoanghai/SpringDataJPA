package com.nguyen.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "clazz")
public class Clazz {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clazz")
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "clazz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Student> students;

    public Clazz(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
