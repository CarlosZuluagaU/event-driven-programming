package com.event.app;

import com.event.app.event.UserRegisteredEvent;
import com.event.app.publisher.ProductPublisher;
import com.event.app.publisher.UserPublisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEventApplication.class, args);
	}


	@Bean
	CommandLineRunner initUsers(UserPublisher userPublisher){
		return args -> {
			userPublisher.publishUserRegisteredEvent();
		};
	}

	@Bean
	CommandLineRunner initProducts (ProductPublisher productPublisher){
		return args -> {
			productPublisher.PublisherEventProduct();
		};
	}

}
