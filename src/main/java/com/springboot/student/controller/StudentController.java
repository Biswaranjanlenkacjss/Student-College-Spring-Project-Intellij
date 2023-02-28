package com.springboot.student.controller;

import com.springboot.student.dto.StudentDao;
import com.springboot.student.service.inter.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    //==========================================================================================================
    //To add or save the Student
    @PostMapping("/stu")
    public ResponseEntity<String> saveStudent(@RequestBody StudentDao studentDao) {
        return studentService.saveStudent(studentDao);
    }
    //==========================================================================================================
    //To Get One Student details
    @GetMapping("/stu/{id}")
    public ResponseEntity<StudentDao> getOneStudent(@PathVariable int id) {
        return studentService.getOneStudent(id);
    }
    //==========================================================================================================
    //To Get All the Student

}
