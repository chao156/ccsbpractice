package com.example.ccpractice;

import com.example.ccpractice.entity.Student;
import com.example.ccpractice.entity.StudentInfo;
import com.example.ccpractice.mapper.StudentMapper;
import com.example.ccpractice.service.StudentInfoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
class CcPracticeApplicationTests {

    @Autowired()
    private StudentMapper mapper;
    @Autowired
    private StudentInfoService service;

    @Test
    public void Test(){
        StudentInfo student = service.getStudent();
        System.out.println(student);
    }


}
