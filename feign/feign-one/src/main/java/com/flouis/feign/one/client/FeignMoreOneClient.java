package com.flouis.feign.one.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "feign-more-one")
public interface FeignMoreOneClient {

	@RequestMapping("/add/{a}/{b}")
	String add(@PathVariable(value = "a") Integer a, @PathVariable(value = "b") Integer b);

}
