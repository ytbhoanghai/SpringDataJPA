package com.nguyen.controller;

import com.nguyen.entity.Clazz;
import com.nguyen.entity.Student;
import com.nguyen.repository.ClazzRepository;
import com.nguyen.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Optional;

@Controller
@RequestMapping(value = "rest/api")
public class APIController {

    private ClazzRepository clazzRepository;
    private StudentRepository studentRepository;

    public APIController(@Autowired ClazzRepository clazzRepository,
                         @Autowired StudentRepository studentRepository) {
        this.clazzRepository = clazzRepository;
        this.studentRepository = studentRepository;
    }

    @PutMapping(value = "{idClass}", consumes = "application/json", produces = "application/json")
    public ResponseEntity doPutStudent(@PathVariable Integer idClass, @RequestBody Student student) {
        Optional<Clazz> optionalClazz = clazzRepository.findById(idClass);
        if (!optionalClazz.isPresent()) { return new ResponseEntity(HttpStatus.NOT_FOUND); }


        if (studentRepository.save(student) == null) {
            return new ResponseEntity("Save is failed", HttpStatus.EXPECTATION_FAILED);
        }

        student.setClazz( optionalClazz.get());
        studentRepository.save(student);

        return new ResponseEntity("Save Success", HttpStatus.OK);
    }
}
