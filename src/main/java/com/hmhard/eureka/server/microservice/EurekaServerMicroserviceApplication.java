package com.hmhard.eureka.server.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerMicroserviceApplication.class, args);
	}

}
