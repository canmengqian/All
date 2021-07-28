package com.free.api.service.feign;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhengzz
 * @version 1.0.0
 * @description 天气预报
 * @date 2021/7/28
 */
@FeignClient(name = "WeatherService",url = "http://aider.meizu.com")
public interface WeatherService {
    @LoadBalanced
    @GetMapping("/app/weather/listWeather")
    public String getWeather(@RequestParam("cityIds") String cityId);
}
