package com.wangzhf.msc.console.controller;

import com.wangzhf.msc.console.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRemote userRemote;

    @RequestMapping("user/{name}")
    public String user(@PathVariable String name) {
        return userRemote.user(name);
    }

}
