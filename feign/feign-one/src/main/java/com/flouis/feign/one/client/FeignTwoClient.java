package com.flouis.feign.one.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "feign-two")
public interface FeignTwoClient {

	@RequestMapping("/add/{a}/{b}")
	Integer add(@PathVariable(value = "a") Integer a, @PathVariable(value = "b") Integer b);

}
