package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySource({"application.properties","application-dev.properties","application-prod.properties"})
public class SpringBootProfilesPropsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesPropsApplication.class, args);
	}

}
