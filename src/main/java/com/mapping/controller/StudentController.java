package com.mapping.controller;

import com.mapping.entities.Student;
import com.mapping.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/students")
public class StudentController
{


    @Autowired
    private StudentService stdService;

    @PostMapping("/savestd")
    public Student saveStudent(@RequestBody Student sid )
    {
        Student s2= stdService.saveStudent(sid);
        return s2;

    }

    @GetMapping("/getstd/{stdId}")
    public Student getStudentData(@PathVariable Integer stdId)
    {
        Student s3=stdService.getStudent(stdId);

        return s3;

    }

    @GetMapping("/getallstd")
    public List<Student> getStudentData()
    {
        List<Student> std= stdService.getAllStudent();

        return std;
    }

    @PutMapping("/updatestd/{stdId}")
    public Student updateStudent(@RequestBody Student student,@PathVariable Integer stdId)
    {

        return stdService.updateStudent(student, stdId);
    }

    @DeleteMapping("/deletestd/{stdId}")
    public void deleteStudentData(@PathVariable Integer stdId)
    {
        stdService.deleteStudent(stdId);
        System.out.println("One Student Data Deleted Successfully..");

    }
}
