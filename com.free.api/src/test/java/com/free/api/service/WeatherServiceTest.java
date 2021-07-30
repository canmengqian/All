package com.free.api.service;

import com.free.api.ApiApplication;
import com.free.api.service.feign.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {ApiApplication.class})
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
class WeatherServiceTest {

    @Resource
    WeatherService weatherService;
    @Test
    void getWeather() {
        String resp = weatherService.getWeather("101240101");
        log.info(resp);
    }
}