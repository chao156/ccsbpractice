package com.example.ccpractice;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ccpractice.mapper")
public class CcPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcPracticeApplication.class, args);
    }

}
