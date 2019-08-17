package com.tlq.eurekaclinet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Description: 获取服务列表-测试用
 * @Author: TanLinQuan
 * @Date: 2019/7/25 14:30
 * @Version: V1.0
 **/
@RestController
public class ServerListController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/serverList")
    public List<String> serverList() {
        List<String> services = discoveryClient.getServices();
        return services;
    }

    @PostMapping(name = "/file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileTest(@RequestParam(value = "file") MultipartFile file) {
        return file.getOriginalFilename();
    }
}
