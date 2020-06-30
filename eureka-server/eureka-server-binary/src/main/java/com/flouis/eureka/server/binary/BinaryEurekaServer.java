package com.flouis.eureka.server.binary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BinaryEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(BinaryEurekaServer.class, args);
	}

	// eureka-server-binary-0.0.1-SNAPSHOT.jar

}
