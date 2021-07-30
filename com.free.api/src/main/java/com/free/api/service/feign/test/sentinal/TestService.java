package com.free.api.service.feign.test.sentinal;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className TestService
 * @description TODO
 * @date 2021/7/29
 */
@Service
public class TestService {
    @SentinelResource(value = "sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
