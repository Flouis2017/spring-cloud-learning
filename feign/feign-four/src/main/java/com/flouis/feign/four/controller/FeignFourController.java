package com.flouis.feign.four.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignFourController {

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable(value = "name") String name){
		return "hello " + name + ", this is feign-four message!";
	}

}
