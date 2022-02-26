package com.example.ccpractice.service.impl;

import com.example.ccpractice.entity.StudentInfo;
import com.example.ccpractice.mapper.StudentInfoMapper;
import com.example.ccpractice.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    StudentInfoMapper mapper;

    @Override
    public int save(StudentInfo studentInfo){
        return mapper.save(studentInfo);
    }

    public List<StudentInfo> selectStudentInfo(){
        return mapper.selectStudentInfo();
    }

    public int batchDelete(String ids){

        String[] idArray = ids.split(",");
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("ids",idArray);
        return mapper.batchDelete(map);
    }
}
