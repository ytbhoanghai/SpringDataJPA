package com.nguyen.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "subject")
public class Subject {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subject")
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "subject")
    private List<StudentSubject> studentSubjectList;

    @ManyToMany(mappedBy = "subjectList")
    private List<Teacher> teacherList;
}
