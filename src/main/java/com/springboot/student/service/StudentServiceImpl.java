package com.springboot.student.service;

import com.springboot.student.dto.StudentDao;
import com.springboot.student.entity.Student;
import com.springboot.student.repositery.StudentRepositery;
import com.springboot.student.service.inter.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepositery studentRepositery;
    //==========================================================================================================
    //To add or save the Student

    @Override
    public ResponseEntity<String> saveStudent(StudentDao studentDao) {
        try{
            Student student=new Student();
            student.setId(studentDao.getId());
            student.setStuName(studentDao.getStuName());
            student.setAddress(studentDao.getAddress());
            student.setCollege(studentDao.getCollege());

            student=studentRepositery.save(student);

            if(student!=null){
                return ResponseEntity.ok("Student Added SuccessFully");
            }else{
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }//end of add student
    //========================================================================================================
    //To Get One Student details

    @Override
    public ResponseEntity<StudentDao> getOneStudent(int id) {
        StudentDao stuDao=null;
        try{
            Optional<Student> option = studentRepositery.findById(id);
            if(option.isPresent()){
                Student student = option.get();
                stuDao=new StudentDao();
                stuDao.setId(student.getId());
                stuDao.setStuName(student.getStuName());
                stuDao.setAddress(stuDao.getAddress());
                stuDao.setCollege(student.getCollege());
            }


        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(stuDao);
    }//end of fet one student
    //========================================================================================================
    //To Get All the Student

    @Override
    public ResponseEntity<List<StudentDao>> getAllStudent() {
        try {


        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
