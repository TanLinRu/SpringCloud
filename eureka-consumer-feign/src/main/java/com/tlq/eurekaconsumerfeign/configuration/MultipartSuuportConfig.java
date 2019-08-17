package com.tlq.eurekaconsumerfeign.configuration;

import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.codec.Encoder;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/26 9:31
 * @Version: V1.0
 **/
@Configuration
public class MultipartSuuportConfig {

    @Bean
    public Encoder feignFormEncoder() {
        return new SpringFormEncoder();
    }
}
