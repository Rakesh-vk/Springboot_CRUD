package com.git.CRUD;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.git.CRUD.model.User;
import com.git.CRUD.service.UserService;

@SpringBootApplication
public class RakeshApplication {
	final UserService userService;
	
	
	public RakeshApplication(UserService userService) {
		super();
		this.userService = userService;
	}


	public static void main(String[] args) {
		SpringApplication.run(RakeshApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
	//to add car details at start of application 
			
		 User user1 = new User(1, "Rakesh", "Kuratti", "Rakesh.kuratti@gmail.com");
		 User user2 = new User(1, "Rakesh", "K", "Rakesh.kuratti@gmail.com");
		 
		 
		 userService.saveUser(user1);
		 userService.saveUser(user2);
		 
		 
		 
		};
	}

}
