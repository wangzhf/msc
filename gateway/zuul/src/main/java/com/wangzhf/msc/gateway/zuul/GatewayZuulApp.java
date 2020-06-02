package com.wangzhf.msc.gateway.zuul;

import com.wangzhf.msc.gateway.zuul.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZuulApp {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulApp.class, args);
    }


    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }
}
