package com.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.entities.User;

@Configuration
@ComponentScan
public class ConfigurationCLass {
	
	
	@Bean
	public User getUser() {
		
		
		User u = new User();
		u.setuEmail();
		
	}
}
