package com.example.ccpractice;

import com.example.ccpractice.entity.Student;
import com.example.ccpractice.mapper.StudentMapper;
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

    @Test
    public void Test(){
        int id = 20;
        List<Student> list = mapper.selectStudentInfo(id);
        System.out.println(list.get(0).getName());
        System.out.println(list);
    }


}
