package com.example.ccpractice.service.impl;

import com.example.ccpractice.entity.StudentInfo;
import com.example.ccpractice.mapper.StudentInfoMapper;
import com.example.ccpractice.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    StudentInfoMapper mapper;

    @Override
    public int save(StudentInfo studentInfo){
        return mapper.save(studentInfo);
    }
}
