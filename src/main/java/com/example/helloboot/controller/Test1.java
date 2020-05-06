package com.example.helloboot.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 1355
 * @date 2020/2/28-23:11
 */
@Configuration
public class Test1 {

     @Bean
        public Test helloService(){
         System.out.println("test1配置类");
            return new Test();
        }

    }
