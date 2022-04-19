package com.demo.anger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.demo.anger")
@SpringBootApplication
@MapperScan("com.demo.anger.data")
public class AngerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngerApplication.class, args);
	}

}
