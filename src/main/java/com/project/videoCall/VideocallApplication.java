package com.project.videoCall;

import com.project.videoCall.service.UserService;
import com.project.videoCall.userDTO.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
					.username("Mainul")
					.email("mainul@gmail.com")
					.password("1234")
					.build());

			service.register(User.builder()
					.username("Robiul")
					.email("robiul@gmail.com")
					.password("1234")
					.build());
		};
	}

}
