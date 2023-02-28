package com.springboot.student.repositery;

import com.springboot.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositery extends JpaRepository<Student,Integer> {
}
