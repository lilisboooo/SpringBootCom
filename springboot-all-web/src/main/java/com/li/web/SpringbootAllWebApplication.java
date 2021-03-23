package com.li.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootAllWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAllWebApplication.class, args);
	}

}
