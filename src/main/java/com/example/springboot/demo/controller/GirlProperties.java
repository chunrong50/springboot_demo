package com.example.springboot.demo.controller;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * 演示从配置文件中获取属性值
 */
@ConfigurationProperties(prefix = "girl")
@Component
public class GirlProperties {
    public String name;
    public  char cupSize;
    public  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getCupSize() {
        return cupSize;
    }

    public void setCupSize(char cupSize) {
        this.cupSize = cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
