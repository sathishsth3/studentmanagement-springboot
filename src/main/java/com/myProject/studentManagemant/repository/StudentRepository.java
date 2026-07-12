package com.myProject.studentManagemant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.studentManagemant.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
