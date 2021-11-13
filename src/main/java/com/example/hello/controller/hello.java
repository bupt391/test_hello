package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {
    @RequestMapping("/test")
    @ResponseBody
    public String testhello(){
        return "第一次测试";
    }
}
