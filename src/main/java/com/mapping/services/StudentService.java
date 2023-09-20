package com.mapping.services;

import com.mapping.entities.Student;

import java.util.List;

public interface StudentService
{

    public Student saveStudent(Student student);

    public Student getStudent(Integer stdId);

    public List<Student> getAllStudent();

    public Student updateStudent(Student student, Integer stdId);

    public void deleteStudent(Integer stdId);
}
