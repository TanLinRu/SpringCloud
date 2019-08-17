package com.tlq.consulconsumerfeign.controller;

import com.tlq.consulconsumerfeign.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 测试
 * @Author: TanLinQuan
 * @Date: 2019/7/25 19:04
 * @Version: V1.0
 **/
@RestController
public class ServiceTets {
    @Autowired
    private ServiceTest serviceTestl;

    @GetMapping(name = "/test")
    public List<String> test() {
        List<String> list = serviceTestl.serverList();
        return list;
    }
}
