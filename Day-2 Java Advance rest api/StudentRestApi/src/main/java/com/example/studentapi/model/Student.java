package com.example.studentapi.model;

import jakarta.persistence.*;

@Entity // This marks the class as a JPA Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String course;

    // Default constructor is needed for JPA
    public Student() {}

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCourse() { return course; }

    public void setCourse(String course) { this.course = course; }
}
