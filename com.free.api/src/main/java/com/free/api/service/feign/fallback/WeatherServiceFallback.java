package com.free.api.service.feign.fallback;

import com.free.api.service.feign.WeatherService;
import org.springframework.stereotype.Component;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className EchoServiceFallback
 * @description TODO
 * @date 2021/7/29
 */

public class WeatherServiceFallback {

    public String getWeather(String cityId) {
        return "hello";
    }
}
