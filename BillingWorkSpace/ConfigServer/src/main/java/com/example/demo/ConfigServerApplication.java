package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
 // add comment for the git
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
