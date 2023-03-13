package dev.todd.MoviesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.processing.Generated;

@SpringBootApplication
public class MoviesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApiApplication.class, args);
	}


}
