package com.nkyd.gitexperiments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitexperimentsApplication {

	public static void main(String[] args) {
		System.out.println("Started");
		SpringApplication.run(GitexperimentsApplication.class, args);
		System.out.println("Ended");
	}

}
