package com.springboot.student.service.inter;

import com.springboot.student.dto.StudentDao;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
    //=========================================================================================
    //To add or save the Student
    public ResponseEntity<String> saveStudent(StudentDao studentDao);
    //=========================================================================================
    //To Get One Student details
    public  ResponseEntity<StudentDao>  getOneStudent(int id);
    //=========================================================================================
    //To Get All the Student
    public ResponseEntity<List<StudentDao>> getAllStudent();
    //=========================================================================================
}
