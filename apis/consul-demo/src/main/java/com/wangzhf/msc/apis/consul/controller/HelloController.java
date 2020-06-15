package com.wangzhf.msc.apis.consul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consul")
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello Consul";
    }

}
