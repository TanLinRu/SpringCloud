package com.tlq.eurekaconsumerfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: Feign组件下实现声明式服务调用
 * @Author: TanLinQuan
 * @Date: 2019/7/25 16:47
 * @Version: V1.0
 **/
@RestController
public class ServiceController {

    @Autowired
    private ServiceInterface serviceInterface;

    @GetMapping("/test")
    public List<String> test() {
        List<String> list = serviceInterface.server();
        return list;
    }
}
