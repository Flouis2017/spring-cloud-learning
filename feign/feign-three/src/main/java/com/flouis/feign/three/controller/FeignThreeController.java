package com.flouis.feign.three.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignThreeController {

	@RequestMapping("/add/{a}/{b}")
	public String add(@PathVariable(value = "a") Integer a, @PathVariable(value = "b") Integer b){
		if (a == null){
			a = 0;
		}
		if (b == null){
			b = 0;
		}
		return "invoke feign-three micro service, the result is: " + (a + b);
	}

}
