package com.miniproject.CollegeNetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@EntityScan("com.miniproject.CollegeNetwork")
@ComponentScan(basePackages = { "com.miniproject.CollegeNetwork" })
public class CollegeNetworkApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CollegeNetworkApplication.class, args);
	}
}
