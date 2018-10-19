package com.limz.rest.rest4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Rest4Application {

    public static void main(String[] args) {
        SpringApplication.run(Rest4Application.class, args);
    }
}
