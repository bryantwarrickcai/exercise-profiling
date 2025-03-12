package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        List<StudentCourse> studentCourses = studentCourseRepository.findAll();
        return studentCourses;
    }

    public Optional<Student> findStudentWithHighestGpa() {
        Student highestGpaStudent = studentRepository.getStudentWithHighestGpa();
        return Optional.ofNullable(highestGpaStudent);
    }

    public String joinStudentNames() {
        String studentsJoined = studentRepository.getAllStudentNamesAsString();
        return studentsJoined;
    }
}

