package com.homework7.homework7;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String mat_nr;
    private String subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMat_nr() {
        return mat_nr;
    }

    public void setMat_nr(String mat_nr) {
        this.mat_nr = mat_nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Student() {

    }

    public Student(int id, String name, String mat_nr, String subject) {
        this.id = id;
        this.name = name;
        this.mat_nr = mat_nr;
        this.subject = subject;
    }
}
