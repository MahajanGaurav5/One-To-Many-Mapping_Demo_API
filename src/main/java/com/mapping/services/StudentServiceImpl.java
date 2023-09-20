package com.mapping.services;

import com.mapping.entities.Student;
import com.mapping.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService
{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student)
    {
        Student s1=new Student();

        s1= studentRepo.save(student);
        return s1;
    }

    @Override
    public void deleteStudent(Integer stdId)
    {
        studentRepo.deleteById(stdId);

    }

    @Override
    public Student getStudent(Integer stdId)
    {
        Student s1=studentRepo.findById(stdId).get();

        return s1;
    }

    @Override
    public List<Student> getAllStudent()
    {
        List<Student> student=new ArrayList<Student>();
        student=studentRepo.findAll();

        return student;
    }

    @Override
    public Student updateStudent(Student student, Integer stdId)
    {
        Optional<Student> optional=studentRepo.findById(stdId);

        Student s2=optional.get();

        //Student s2=studentRepo.findById(stdId).get();

        s2.setStdId(stdId);
        s2.setStudentName(student.getStudentName());
        s2.setAbout(student.getAbout());

        return studentRepo.save(s2);
    }
}
