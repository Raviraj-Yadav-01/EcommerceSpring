package com.example.ecommercespring;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringApplication {

	public static void main(String[] args) {

		// load environment file from .env file
		Dotenv dotenv = Dotenv.configure().load();


		// Set all .env variables as system properties
		dotenv.entries().forEach( entry ->
				System.setProperty(entry.getKey(), entry.getValue()))
		;

		SpringApplication.run(EcommerceSpringApplication.class, args);
	}
}





