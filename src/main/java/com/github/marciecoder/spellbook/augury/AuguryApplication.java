package com.github.marciecoder.spellbook.augury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AuguryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuguryApplication.class, args);
	}

}
