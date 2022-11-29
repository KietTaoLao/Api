package com.example.Location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaClient
public class LocationApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(LocationApplication.class, args);
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
					.allowedMethods("GET", "POST", "OPTIONS", "DELETE", "PUT", "PATCH");
	};
	}


