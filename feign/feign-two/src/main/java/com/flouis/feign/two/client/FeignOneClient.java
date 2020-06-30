package com.flouis.feign.two.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "feign-one")
public interface FeignOneClient {

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable(value = "name") String name);

}
