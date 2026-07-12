package com.myProject.studentManagemant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.myProject.studentManagemant.entity.Student;
import com.myProject.studentManagemant.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long userId) {
        Optional<Student> optionalStudent = studentRepository.findById(userId);
        return optionalStudent.get();
    }

    @Override
    public List<Student> getAllStudents() {
         return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {

        Student existingStudent = studentRepository.findById(student.getRollNo()).get();

        existingStudent.setName(student.getName());
        existingStudent.setClassName(student.getClassName());
        existingStudent.setSection(student.getSection());
        existingStudent.setPercentage(student.getPercentage());
        existingStudent.setLocation(student.getLocation());
        existingStudent.setTransport(student.getTransport());

        Student updatedStudent = studentRepository.save(existingStudent);
        return updatedStudent;
    }

    @Override
    public void deleteStudent(Long userId) {
        studentRepository.deleteById(userId);
    }
    
}
