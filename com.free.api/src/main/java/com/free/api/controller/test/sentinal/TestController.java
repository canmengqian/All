package com.free.api.controller.test.sentinal;

import com.free.api.service.feign.test.sentinal.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className TestController
 * @description TODO
 * @date 2021/7/29
 */
@RestController
public class TestController {
    @Resource
    private TestService service;

    @GetMapping(value = "/hello/{name}")
    public String apiHello(@PathVariable String name) {
        return service.sayHello(name);
    }
}
