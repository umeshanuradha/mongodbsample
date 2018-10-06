package com.umesh.mongosample;

import com.umesh.mongosample.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.tools.jar.CommandLine;

@SpringBootApplication
public class MongosampleApplication implements CommandLineRunner{

	@Autowired
	private UsersRepository usersRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongosampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(usersRepository.findAll());

	}
}
