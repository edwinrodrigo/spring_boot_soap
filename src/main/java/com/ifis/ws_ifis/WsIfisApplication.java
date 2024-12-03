package com.ifis.ws_ifis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.webservices.WebServicesAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = WebServicesAutoConfiguration.class)
public class WsIfisApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsIfisApplication.class, args);
	}

}
