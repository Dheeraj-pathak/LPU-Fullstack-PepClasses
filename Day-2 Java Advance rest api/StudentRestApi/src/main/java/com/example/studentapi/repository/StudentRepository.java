package com.example.studentapi.repository;

import com.example.studentapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// This will auto-create common DB methods like save, findAll, findById, deleteById, etc.
public interface StudentRepository extends JpaRepository<Student, Long> {
}
