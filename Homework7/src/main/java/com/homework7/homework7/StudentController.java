package com.homework7.homework7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable int id) {
        return studentRepository.findById(id);
    }

    @PostMapping("")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable int id) {
        studentRepository.deleteById(id);
    }
}
