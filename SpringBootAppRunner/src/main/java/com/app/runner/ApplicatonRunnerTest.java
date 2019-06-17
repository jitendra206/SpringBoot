package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicatonRunnerTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//1)reading all keys
		Set<String> optionKeys = args.getOptionNames();
		System.out.println(Arrays.asList(optionKeys));

		//2)one key related values
		List<String> list = args.getOptionValues("profile");
		System.out.println(Arrays.asList(list));

		//3)checking for key existency
		System.out.println(args.containsOption("name"));
		System.out.println(args.containsOption("userid"));
		
		//4)non option arguments
		String[] ar= args.getSourceArgs();
		System.out.println(Arrays.asList(ar));
	}

}
