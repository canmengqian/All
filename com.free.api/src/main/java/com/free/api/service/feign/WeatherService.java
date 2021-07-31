package com.free.api.service.feign;

import com.free.api.service.feign.fallback.WeatherServiceFallback;
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
    @GetMapping("/app/weather/listWeather")
     String getWeather(@RequestParam("cityIds") String cityId);
}
