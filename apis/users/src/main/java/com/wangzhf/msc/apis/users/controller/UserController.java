package com.wangzhf.msc.apis.users.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("user/{name}")
    public String user(@PathVariable String name) {
        return "hello " + name;
    }

}
