package com.BikkadIT.SecondApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.BikkadIT.SecondApp","com.BikkadIT.SecondApp.model"})
public class SecondAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondAppApplication.class, args);
	}

}
