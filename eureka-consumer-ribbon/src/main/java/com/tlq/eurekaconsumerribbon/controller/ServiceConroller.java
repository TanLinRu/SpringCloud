package com.tlq.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: Ribbon组件下消费者测试
 * @Author: TanLinQuan
 * @Date: 2019/7/25 16:23
 * @Version: V1.0
 **/
@RestController
public class ServiceConroller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String serviceTest() {
        return restTemplate.getForObject("http://server-provider/serverList", String.class);
    }
}
