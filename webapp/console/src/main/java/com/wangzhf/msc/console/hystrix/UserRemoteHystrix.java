package com.wangzhf.msc.console.hystrix;

import com.wangzhf.msc.console.remote.UserRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class UserRemoteHystrix implements UserRemote {

    @Override
    public String user(@PathVariable(value = "name") String name) {
        return "Hello " + name + ", this request is failured";
    }
}
