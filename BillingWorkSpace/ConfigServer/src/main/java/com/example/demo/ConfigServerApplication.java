package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
 // add comment for the git
	// add comment 1
<<<<<<< HEAD
	// add 3nd comment
	// modification apres ajout du 2eme branche
	//modification a suppimer
=======
	// add 2nd comment 
>>>>>>> parent of a9575a4 (commentaire fil branche jdida)
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
