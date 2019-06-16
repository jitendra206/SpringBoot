package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
public class RunnerClass implements CommandLineRunner {

	@Value("${my.message}")
	private String message;
	
	@Value("${my.code}")
	private String code;
	
	@Value("{my.mode}")
	private String mode;


	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	

	@Override
	public String toString() {
		return "RunnerClass [message=" + message + ", code=" + code + ", mode=" + mode + "]";
	}
	
	
	
	
	
}
