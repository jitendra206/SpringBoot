package com.app
;

import java.util.Arrays;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootGitFirstProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication s = new SpringApplication(SpringBootGitFirstProjectApplication.class);
		s.setBannerMode(Banner.Mode.CONSOLE);
		s.run(args);
	}
	
	//displaying all beans created in container
	public static void main1(String[] args) {
		ConfigurableApplicationContext cac=	SpringApplication.run(SpringBootGitFirstProjectApplication.class, args);
		String[] beanNames = cac.getBeanDefinitionNames();
		System.out.println("No.of beans = "+beanNames.length);
		Arrays.sort(beanNames);
		for(String s:beanNames) {
			System.out.println(s) ;
		}
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("TEST from run method");		
	}

}
