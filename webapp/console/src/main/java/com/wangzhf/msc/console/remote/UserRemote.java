package com.wangzhf.msc.console.remote;

import com.wangzhf.msc.console.hystrix.UserRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "msc-apis-users", fallback = UserRemoteHystrix.class)
public interface UserRemote {

    @RequestMapping("user/{name}")
    String user(@PathVariable(value = "name") String name);

}
