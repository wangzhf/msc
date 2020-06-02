package com.wangzhf.msc.apis.users.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @RequestMapping("user/{name}")
    public String user(@PathVariable String name) {
        log.info("request name is : {}", name);
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            log.error("hello error", e);
        }
        return "hello " + name;
    }

}
