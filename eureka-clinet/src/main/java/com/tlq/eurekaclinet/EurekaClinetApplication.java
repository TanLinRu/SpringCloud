package com.tlq.eurekaclinet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//在新版本中，此注解@EnableEurekaClient可不再使用，也可以将server-provider注册到服务中心去
public class EurekaClinetApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClinetApplication.class, args);
    }

}
