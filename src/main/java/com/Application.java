package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *@author duanlb
 *@date 2017��2��10�� ����11:16:40
 *
**/
@SpringBootApplication
//@ComponentScan(basePackages={"com.base"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
