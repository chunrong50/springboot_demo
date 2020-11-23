package com.example.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个应用
 */
@RestController
public class Hello {

    @GetMapping("/hello")
    public String say(){
       return "start my first springboot !";
    }

}
