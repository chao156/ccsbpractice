package com.example.ccpractice.service;

import com.example.ccpractice.entity.StudentInfo;
import org.springframework.stereotype.Service;

public interface StudentInfoService {
    int save(StudentInfo studentInfo);
}
