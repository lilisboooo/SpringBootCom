package com.li.service;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootAllServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAllServiceApplication.class, args);
    }

}
