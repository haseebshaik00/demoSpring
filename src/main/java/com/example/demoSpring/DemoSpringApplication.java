package com.example.demoSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demoSpring.api"})
public class DemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}
}
