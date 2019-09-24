package com.nata.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.nata.jpa.model.User;
import com.nata.jpa.repositorie.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class NataJpaExerciseApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NataJpaExerciseApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(UserRepository repository, PasswordEncoder encoder) {
		return (args) -> {
			// save a few customers
			repository.save(new User("jack","Jack@naver.com",encoder.encode("admin123!")));
			repository.save(new User("chloe","Chloe@naver.com",encoder.encode("admin123!")));
			repository.save(new User("kim","Kim@naver.com",encoder.encode("admin123!")));
			repository.save(new User("david","David@naver.com",encoder.encode("admin123!")));
			repository.save(new User("michelle","Michelle@naver.com",encoder.encode("admin123!")));
			
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
