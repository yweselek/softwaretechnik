package com.homework7.homework7;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByName(String name);
    //List<Student> findByMat_nr(int mat_nr);
}
