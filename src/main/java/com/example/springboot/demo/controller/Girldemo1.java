package com.example.springboot.demo.controller;


import com.example.springboot.demo.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Girldemo1 {

    @Resource
    private Girl girl;

    @GetMapping("/getGirl")
    public String getGirl(){

        return "年龄："+girl.getAge();

    }
}
