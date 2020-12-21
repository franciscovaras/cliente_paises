package com.fvarasg.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroservicioClientePaisesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MicroservicioClientePaisesApplication.class, args);
	}
	
	@Bean
	public RestTemplate template () {
		return new RestTemplate();
	}

}
