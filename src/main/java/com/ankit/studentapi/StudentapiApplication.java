package com.ankit.studentapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    Build a Student CRUD REST API in Spring Boot with GET /students, GET /students/{id},
    POST /students, DELETE /students/{id}. Store data in a simple List (no DB needed yet).
    Test with Postman or curl.

*/
@SpringBootApplication
public class StudentapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentapiApplication.class, args);
	}

}
