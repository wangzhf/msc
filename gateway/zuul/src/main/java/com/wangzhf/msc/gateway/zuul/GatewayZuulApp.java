package com.wangzhf.msc.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZuulApp {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulApp.class, args);
    }

}
