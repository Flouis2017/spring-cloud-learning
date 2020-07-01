package com.flouis.feign.one.controller;

import com.flouis.feign.one.client.FeignMoreOneClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignOneController {

	@Resource
	private FeignMoreOneClient feignMoreOneClient;

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable(value = "name") String name){
		return "hello " + name + ", this is feign-one message!";
	}

	@RequestMapping("/add/{a}/{b}")
	public String add(@PathVariable(value = "a") Integer a, @PathVariable(value = "b") Integer b){
		return this.feignMoreOneClient.add(a, b);
	}

}
