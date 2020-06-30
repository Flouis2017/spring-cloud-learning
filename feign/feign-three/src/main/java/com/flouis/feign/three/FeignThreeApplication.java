package com.flouis.feign.three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FeignThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignThreeApplication.class, args);
	}

}
