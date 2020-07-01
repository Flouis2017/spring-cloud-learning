package com.flouis.feign.one.client.hystrix;

import com.flouis.feign.one.client.FeignMoreOneClient;
import org.springframework.stereotype.Component;

@Component
public class FeignMoreOneHystrix implements FeignMoreOneClient {


	@Override
	public String add(Integer a, Integer b) {
		return "Server Error, Please Try Again Later~";
	}
}
