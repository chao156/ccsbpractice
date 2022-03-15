package com.example.ccpractice.controller;

import com.example.ccpractice.entity.Student;
import com.example.ccpractice.entity.StudentInfo;
import com.example.ccpractice.result.Result;
import com.example.ccpractice.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@RestController
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
    @RequestMapping(value = "/batchDelete",produces = "application/json")
    public Result batchDelete(@RequestBody String ids) throws UnsupportedEncodingException {
        String s = URLDecoder.decode(ids,"utf-8");
        String idString = s.substring(0,s.length()-1);
        int tag = service.batchDelete(idString);
        if(tag == 1) {
            return new Result(200);
        }else{
            return new Result(400);
        }
    }
}
