package com.wangzhf.msc.webapp.consul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class CallHelloController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/call")
    public String call() {
        ServiceInstance instance = loadBalancerClient.choose("service-producer");
        log.info("服务地址: {}", instance.getUri());
        log.info("服务名称: {}", instance.getServiceId());

        String callServiceResult = new RestTemplate().getForObject(instance.getUri().toString() + "/consul/hello", String.class);
        log.info("result: {}", callServiceResult);
        return callServiceResult;
    }

}
