package com.myProject.studentManagemant.service;

import java.util.List;

import com.myProject.studentManagemant.entity.Student;

public interface StudentService {
    
    Student createStudent(Student student);

    Student getStudentById(Long userId);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    void deleteStudent(Long userId);
     
}
