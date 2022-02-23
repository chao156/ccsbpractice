package com.example.ccpractice.controller;

import com.example.ccpractice.entity.User;
import com.example.ccpractice.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @CrossOrigin
    @RequestMapping("api/login")
    @ResponseBody
    public Result login(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        if(!"admin".equals(username)||!"123".equals(password)){
            return new Result(400);
        }else{
            return new Result(200);
        }

    }
}
