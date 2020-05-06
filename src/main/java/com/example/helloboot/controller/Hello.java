package com.example.helloboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author 1355
 * @date 2020/2/25-18:03
 */

@Controller
public class Hello {

    private  String name1;
    private int age1;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    @RequestMapping("/index")
    @ResponseBody
    public String sayHello(){
        return "index";
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name1='" + name1 + '\'' +
                ", age1=" + age1 +
                '}';
    }
}
