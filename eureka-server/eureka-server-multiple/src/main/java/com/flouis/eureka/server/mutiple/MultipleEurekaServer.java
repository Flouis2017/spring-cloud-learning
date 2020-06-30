package com.flouis.eureka.server.mutiple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MultipleEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(MultipleEurekaServer.class, args);
	}

}
