package com.pod2.bank.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringReactiveAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveAccountApplication.class, args);
	}

}
