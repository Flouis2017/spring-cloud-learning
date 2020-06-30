package com.flouis.eureka.server.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SingletonEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(SingletonEurekaServer.class, args);
	}

}
