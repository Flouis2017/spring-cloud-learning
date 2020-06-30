package com.flouis.feign.one.controller;

import com.flouis.feign.one.client.FeignTwoClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignOneController {

	@Resource
	private FeignTwoClient feignTwoClient;

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable(value = "name") String name){
		System.out.println("invoke feign-one micro service: hello");
		return "hello " + name + ", this is feign-one message!";
	}

	@RequestMapping("/add/{a}/{b}")
	public String add(@PathVariable(value = "a") Integer a, @PathVariable(value = "b") Integer b){
		return "The result is " + this.feignTwoClient.add(a, b);
	}

}
