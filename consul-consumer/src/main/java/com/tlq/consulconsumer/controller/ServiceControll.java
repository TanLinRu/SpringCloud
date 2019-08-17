package com.tlq.consulconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: 服务消费者测试
 * @Author: TanLinQuan
 * @Date: 2019/7/25 16:06
 * @Version: V1.0
 **/
@RestController
public class ServiceControll {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String serviceTest() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("consul-provider");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/serverList";
        return restTemplate.getForObject(url, String.class);
    }
}
