package com.example.Zuuserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication

@EnableEurekaClient
public class ZuuserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuuserverApplication.class, args);
	}

}
