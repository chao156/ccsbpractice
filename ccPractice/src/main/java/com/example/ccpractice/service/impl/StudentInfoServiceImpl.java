package com.example.ccpractice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.ccpractice.entity.Student;
import com.example.ccpractice.entity.StudentInfo;
import com.example.ccpractice.mapper.StudentInfoMapper;
import com.example.ccpractice.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public StudentInfo getStudent(){
        LambdaQueryWrapper<StudentInfo> wrapper = new LambdaQueryWrapper();
        wrapper.eq(StudentInfo::getId,null)
                .eq(StudentInfo::getAge,18);
        StudentInfo studentInfo = mapper.selectOne(wrapper);
        return studentInfo;
    }
    public int batchDelete(String ids){
        int tag = 1;
        String[] idArray = ids.split(",");
        for(int i = 0 ; i < idArray.length ; i++){
            tag = mapper.batchDelete(idArray[i]);
            if(tag == 0){
                break;
            }
        }
        return tag;

    }
}
