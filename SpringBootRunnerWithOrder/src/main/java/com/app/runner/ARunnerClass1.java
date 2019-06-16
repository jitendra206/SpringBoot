package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
//@Order(3)
public class ARunnerClass1 implements Ordered,CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From runner class-A");
	}

	@Override
	public int getOrder() {
		return 3;
	}
	
	

}
