package com.example.springboot.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlInfo {
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping("/girlInfo")
    public  String  getGirl(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myid){

        return  "姓名:"+ girlProperties.name +" 年龄:"+ girlProperties.age+"  罩杯:"+ girlProperties.cupSize +myid;
    }
}
