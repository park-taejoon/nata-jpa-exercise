package com.nata.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nata.jpa.model.User;
import com.nata.jpa.repositorie.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication//compnontScan Root 패키지를 자동스캔하는것 같은데.
public class NataJpaExerciseApplication {
	//ConfigurationPropertiesScan //검색할 특정 패키지를 정의하도록 지정할 수 있다. 특정 패키지가 없는 경우 지정이 안되어있으면 @AliasFor("basePackages") 잡음.
	
	public static void main(String[] args) {
		SpringApplication.run(NataJpaExerciseApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new User("jack","Jack@naver.com"));
			repository.save(new User("chloe","Chloe@naver.com"));
			repository.save(new User("kim","Kim@naver.com"));
			repository.save(new User("david","David@naver.com"));
			repository.save(new User("michelle","Michelle@naver.com"));
			
			// fetch all customers
			log.info("user found with findAll():");
			log.info("-------------------------------");
			for (User customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			
		};
	}

}
