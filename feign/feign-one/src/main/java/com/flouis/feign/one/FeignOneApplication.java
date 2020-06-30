package com.flouis.feign.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient // 服务注册与发现的注解，使用该注解后本微服务将会被注册到Eureka注册中心，以供其他微服务调用
@EnableFeignClients // 服务调用注解，配合@FeignClient(name="<spring.application.name>")使用调用其他微服务
public class FeignOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignOneApplication.class, args);
	}

}
