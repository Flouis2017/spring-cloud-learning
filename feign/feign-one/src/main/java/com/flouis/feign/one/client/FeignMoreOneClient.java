package com.flouis.feign.one.client;

import com.flouis.feign.one.client.hystrix.FeignMoreOneHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "feign-more-one", fallback = FeignMoreOneHystrix.class)
public interface FeignMoreOneClient {

	@RequestMapping("/add/{a}/{b}")
	String add(@PathVariable(value = "a") Integer a, @PathVariable(value = "b") Integer b);

}
