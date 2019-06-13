package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.NotificationService;

@Component
public class RunnerClass implements CommandLineRunner{

	@Autowired
	private NotificationService notificationService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RUNNNNNERRRRRRRRR");
		notificationService.getMessage();
	}
}
