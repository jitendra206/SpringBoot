package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sms")
public class SmsService implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sms profile activated");
	}

}
