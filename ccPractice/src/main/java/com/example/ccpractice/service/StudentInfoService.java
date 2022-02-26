package com.example.ccpractice.service;

import com.example.ccpractice.entity.StudentInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentInfoService {
    int save(StudentInfo studentInfo);
    List<StudentInfo> selectStudentInfo();
    int batchDelete(String ids);
}
