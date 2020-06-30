package com.flouis.feign.two.controller;

import com.flouis.feign.two.client.FeignOneClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignTwoController {

	@Resource
	private FeignOneClient feignOneClient;

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable(value = "name") String name){
		System.out.println("invoke feign-two micro service: hello");
		return this.feignOneClient.hello(name);
	}

	@RequestMapping("/add/{a}/{b}")
	public String add(@PathVariable(value = "a") Integer a, @PathVariable(value = "b") Integer b){
		if (a == null){
			a = 0;
		}
		if (b == null){
			b = 0;
		}
		return "invoke feign-two micro service, the result is: " + (a + b);
	}

}
