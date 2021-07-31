package com.free.api.controller.test.nacos;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className NacosTetController
 * @description TODO
 * @date 2021/7/30
 */
@RestController
@RequestMapping("/api/nacos")
public class NacosTetController {

    @NacosValue(autoRefreshed = true,value = "${useLocalCache:false}")
    Boolean val;

    @GetMapping("/index")
    public String index(){
        return  val.toString();
    }
}
