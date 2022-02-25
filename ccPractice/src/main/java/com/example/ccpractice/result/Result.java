package com.example.ccpractice.result;

import java.util.List;

public class Result {
    public Result(){}
    public Result(int code){
        this.code = code;
    }
    public Result(List list){this.list = list;}
    private int code;
    private String message;
    private List list;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
