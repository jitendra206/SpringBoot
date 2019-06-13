package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultNotificationService implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Default profile activated");
	}
}
