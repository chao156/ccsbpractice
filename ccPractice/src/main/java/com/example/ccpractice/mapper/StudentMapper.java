package com.example.ccpractice.mapper;


import com.example.ccpractice.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> selectStudentInfo(int id);
}
