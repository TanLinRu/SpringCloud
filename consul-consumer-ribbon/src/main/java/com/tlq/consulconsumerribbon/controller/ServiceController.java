package com.tlq.consulconsumerribbon.controller;

import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: Ribbon组件下服务消费者的测试
 * @Author: TanLinQuan
 * @Date: 2019/7/25 16:33
 * @Version: V1.0
 **/
@RestController
public class ServiceController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test() {
        return restTemplate.getForObject("http://consul-provider/serverList", String.class);
    }
}
