package com.tlq.consulconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Description: Feign下服务调度
 * @Author: TanLinQuan
 * @Date: 2019/7/25 19:02
 * @Version: V1.0
 **/
@FeignClient(name = "consul-provider")
public interface ServiceTest {

    @GetMapping("/serverList")
    public List<String> serverList();
}
