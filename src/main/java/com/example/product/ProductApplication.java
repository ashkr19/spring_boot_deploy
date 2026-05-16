package com.example.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		System.out.println("Starting Product Application...");
		SpringApplication.run(ProductApplication.class, args);
	}

}
