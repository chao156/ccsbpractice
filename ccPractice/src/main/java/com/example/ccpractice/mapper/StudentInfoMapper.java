package com.example.ccpractice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ccpractice.entity.StudentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface StudentInfoMapper extends BaseMapper<StudentInfo> {
    int save(StudentInfo studentInfo);
    List<StudentInfo> selectStudentInfo();
    int batchDelete(String ids);
    List<StudentInfo> getStudent();

}
