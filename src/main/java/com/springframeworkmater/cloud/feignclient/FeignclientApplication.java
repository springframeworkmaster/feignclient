package com.springframeworkmater.cloud.feignclient;

import feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientApplication.class, args);



		System.out.println();
	}
}
