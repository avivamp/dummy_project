package io.damonP.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HelloApp {
	 
	public static void main(String[] args) {
		SpringApplication.run(HelloApp.class, args);
	}

}
