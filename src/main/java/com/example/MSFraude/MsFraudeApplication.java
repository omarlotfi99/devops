package com.example.MSFraude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.CloudEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsFraudeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFraudeApplication.class, args);
	}

}
