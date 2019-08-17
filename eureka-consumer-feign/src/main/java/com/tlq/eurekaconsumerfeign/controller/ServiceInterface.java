package com.tlq.eurekaconsumerfeign.controller;

import com.tlq.eurekaconsumerfeign.configuration.MultipartSuuportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Description: Feign声明式服务调用
 * @Author: TanLinQuan
 * @Date: 2019/7/25 16:50
 * @Version: V1.0
 **/
@FeignClient(value = "server-provider", configuration = MultipartSuuportConfig.class)
public interface ServiceInterface {

    @GetMapping("/serverList")
    public List<String> server();


    @PostMapping(name = "/file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileTest(@RequestParam(value = "file") MultipartFile file);
}
