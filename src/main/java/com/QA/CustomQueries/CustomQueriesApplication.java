package com.QA.CustomQueries;

import Persistence.Repo.PersonRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CustomQueriesApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(CustomQueriesApplication.class,args);
		PersonRepo repo = applicationContext.getBean(PersonRepo.class);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();


	}

}
