package com.wangzhf.msc.apis.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsulApp.class, args);
    }
}
