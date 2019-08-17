package com.tlq.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description: 服务消费者
 * @Author: TanLinQuan
 * @Date: 2019/7/25 15:30
 * @Version: V1.0
 **/
@RestController
public class ServiceConsumer {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String serviceList() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("server-provider");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/serverList";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
}
