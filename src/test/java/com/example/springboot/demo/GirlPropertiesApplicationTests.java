package com.example.springboot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class GirlPropertiesApplicationTests {


    @Test
    void contextLoads() {
        System.out.println("maven spring boot test");
    }

    @Test
    void  demo1(){
        Assert.doesNotContain("hellworld","hello","my");
    }

    @Test
    void  demo2(){
        Assert.doesNotContain("helloworld","hello","my");
    }


    @Test
    void  demo3(){
        Assert.doesNotContain("helloworld","*","my");
    }



}
