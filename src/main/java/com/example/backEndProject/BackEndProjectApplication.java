package com.example.backEndProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BackEndProjectApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(BackEndProjectApplication.class, args);
	}

	//first commit test cem branch

	@Override
	public void run (String... args) throws Exception {
		String sql = "";
	}
	// lets see if it works

}
