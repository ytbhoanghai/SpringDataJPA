package com.nguyen.repository;

import com.nguyen.entity.Student;
import com.nguyen.entity.StudentSubject;
import com.nguyen.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentSubjectRepository extends JpaRepository<StudentSubject, StudentSubject.StudentSubjectId> {

    List<StudentSubject> findByStudentAndSubject(Student student, Subject subject);
}
