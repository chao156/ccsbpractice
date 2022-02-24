package com.example.ccpractice.controller;

import com.example.ccpractice.entity.StudentInfo;
import com.example.ccpractice.result.Result;
import com.example.ccpractice.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("student")
public class StudentInfoController {

    @Autowired
    private StudentInfoService service;

    @CrossOrigin
    @RequestMapping("/save")
    @ResponseBody
    public Result save(@RequestBody StudentInfo studentinfo){
        //studentinfo.setId(1);
        int tag = service.save(studentinfo);
        if(tag == 1) {
            return new Result(200);
        }else{
            return new Result(400);
        }
    }
}
