package com.nguyen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private Integer id;

    private String name;
    private String address;

    @ManyToOne(cascade = CascadeType.ALL)  @JoinColumn(name = "id_clazz")
    private Clazz clazz;

    @OneToMany(mappedBy = "student")
    private List<StudentSubject> studentSubjectList;

    public Student(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
