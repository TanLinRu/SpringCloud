package com.tlq.consulconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class ConsulConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerFeignApplication.class, args);
    }


}
