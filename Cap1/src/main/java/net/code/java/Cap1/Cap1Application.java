package net.code.java.Cap1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient

public class Cap1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cap1Application.class, args);
	}

}
