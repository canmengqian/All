package com.free.api.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className WeatherController
 * @description TODO
 * @date 2021/7/28
 */
@RestController
@RequestMapping("/api")
@Api(tags = "2.0.3版本-20200312")
@ApiSupport(author = "xiaoymin@foxmail.com",order = 284)
public class WeatherController {

    @Resource
    Environment environment;

    @ApiOperationSupport(author = "xiaoymin@foxmail.com")
    @ApiOperation(value = "写文档注释我是认真的")
    @GetMapping("/index")
    public  String index() {
        return  environment.getProperty ("server.port");
    }
}
