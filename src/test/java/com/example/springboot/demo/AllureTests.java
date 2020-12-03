package com.example.springboot.demo;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
public class AllureTests {
    @Test
    void  test1(){
     Assert.isTrue(1==1, "right");

    }

    @Test
    void  test2(){
        Assert.isTrue(1==2, "error");
    }



    @Test
    void  test3(){
        Assert.isTrue(1==2/0, "exception");
    }

    @Disabled
    @Test
    void  test4(){
        Assert.isTrue(1==9, "skip");
    }

}
