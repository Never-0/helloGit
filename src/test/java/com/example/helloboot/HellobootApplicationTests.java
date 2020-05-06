package com.example.helloboot;

import com.example.helloboot.controller.Hello;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HellobootApplicationTests {
	@Autowired
	com.example.helloboot.controller.Test test;
	@Autowired
	Hello hello;
	@Autowired
	ApplicationContext ioc;
	@Test
	public  void  ptest(){
		boolean test = ioc.containsBean("helloService");
		System.out.println(test);
	}

	@Test
	public void contextLoads() {
		System.out.println(test+"--"+hello);
	}

}
