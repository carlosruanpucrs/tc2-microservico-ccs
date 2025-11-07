package com.carlosruanpucrs.tc2_microservico_ccs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Tc2MicroservicoCcsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tc2MicroservicoCcsApplication.class, args);
    }

}
