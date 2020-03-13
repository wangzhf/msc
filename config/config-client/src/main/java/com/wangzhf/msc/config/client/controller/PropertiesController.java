package com.wangzhf.msc.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
@RestController
@RequestMapping("prop")
public class PropertiesController {

    @Value("${msc.key}")
    private String key;

    @Value("${msc.value}")
    private String value;

    @RequestMapping("list")
    public String list() {
        return "Get the config: " + key + ": " + value;
    }

}
