package com.example.helloboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 1355
 * @date 2020/2/27-17:16
 */

@Component
@ConfigurationProperties(prefix = "test")
public class Test {
    //@Value("${test.name}")
    private String name;
    private int age;
    private List<String> list;
    private Hello hello;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", hello=" + hello +
                '}';
    }
}
