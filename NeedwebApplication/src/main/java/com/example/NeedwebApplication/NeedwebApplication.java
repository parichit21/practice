package com.example.NeedwebApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.model.Server;
import com.example.repositories.Usersignuprepositorie;

import org.springframework.boot.autoconfigure.batch.JobLauncherCommandLineRunner;

@SpringBootApplication
@EntityScan
@ComponentScan(basePackages= {"com.example.rest.Controller"})
public class NeedwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeedwebApplication.class, args);
	System.out.println("hi");
	
	}
	/*
	 * @Autowired Usersignuprepositorie usersignuprepositorie;
	 * 
	 * @Bean
	 * 
	 * @Autowired Object commandLineRunner(Usersignuprepositorie
	 * usersignuprepositorie) {
	 * 
	 * return usersignuprepositorie; //args-> {
	 * 
	 * usersignuprepositorie.save( new Server(firstname, lastname , email , password
	 * ));
	 * 
	 * };
	 * 
	 * }
	 */
	
	
	
}
