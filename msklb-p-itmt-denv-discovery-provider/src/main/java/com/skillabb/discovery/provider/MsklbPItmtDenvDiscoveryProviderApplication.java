package com.skillabb.discovery.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsklbPItmtDenvDiscoveryProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsklbPItmtDenvDiscoveryProviderApplication.class, args);
	}

}
