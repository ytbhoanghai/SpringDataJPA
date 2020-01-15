package com.nguyen.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "student_subject")
public class StudentSubject {

    @EmbeddedId
    private StudentSubjectId id;

    @ManyToOne
    @MapsId(value = "idStudent")
    private Student student;

    @ManyToOne
    @MapsId(value = "idSubject")
    private Subject subject;

    @Column(name = "date_start")
    private Date dateStart;

    @Column(name = "date_finish")
    private Date dateFinish;

    @Data
    @Embeddable
    public static class StudentSubjectId implements Serializable {
        @JoinColumn(name = "id_student") private Integer idStudent;
        @JoinColumn(name = "id_subject")private Integer idSubject;
    }
}
