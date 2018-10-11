package com.duli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StoreCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreCloudEurekaApplication.class, args);
    }
}
