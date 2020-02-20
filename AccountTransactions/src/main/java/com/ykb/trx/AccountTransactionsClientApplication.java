package com.ykb.trx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@ComponentScan
public class AccountTransactionsClientApplication   {

	public static void main(String[] args) {
		SpringApplication.run(AccountTransactionsClientApplication.class, args);
	}

	
  
	
}
