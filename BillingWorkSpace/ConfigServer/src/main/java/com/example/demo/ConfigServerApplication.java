package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
 // add comment for the git
	// add comment 1
	// add 3nd comment
	// modification apres ajout du 2eme branche
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
