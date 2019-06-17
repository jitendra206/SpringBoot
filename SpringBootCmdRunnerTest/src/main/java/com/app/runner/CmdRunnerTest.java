package com.app.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunnerTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		//args=> --hi=hello --hello=bye
		System.out.println(Arrays.asList(args));
	}

}
