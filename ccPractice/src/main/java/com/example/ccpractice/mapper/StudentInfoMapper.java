package com.example.ccpractice.mapper;

import com.example.ccpractice.entity.StudentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface StudentInfoMapper {

    int save(StudentInfo studentInfo);
    List<StudentInfo> selectStudentInfo();
    int batchDelete(HashMap<String,Object> map);
}
