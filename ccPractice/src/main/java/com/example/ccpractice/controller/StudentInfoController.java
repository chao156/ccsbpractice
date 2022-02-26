package com.example.ccpractice.controller;

import com.example.ccpractice.entity.Student;
import com.example.ccpractice.entity.StudentInfo;
import com.example.ccpractice.result.Result;
import com.example.ccpractice.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentInfoController {

    @Autowired
    private StudentInfoService service;

    @CrossOrigin
    @RequestMapping("/save")
    @ResponseBody
    public Result save(@RequestBody StudentInfo studentinfo){
        int tag = service.save(studentinfo);
        if(tag == 1) {
            return new Result(200);
        }else{
            return new Result(400);
        }
    }

    @CrossOrigin
    @RequestMapping("/selectStudentInfo")
    @ResponseBody
    public Result selectStudentInfo(){
        List<StudentInfo> list = service.selectStudentInfo();
        return new Result(list);
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/batchDelete")
    public Result batchDelete(@RequestBody String ids){
        int tag = service.batchDelete(ids);
        if(tag == 1) {
            return new Result(200);
        }else{
            return new Result(400);
        }
    }
}
