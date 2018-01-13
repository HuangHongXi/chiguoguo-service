package com.huanghongxi.chiguoguoservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@ComponentScan(value = "com.huanghongxi")
@MapperScan("com.huanghongxi.chiguoguoservice.dao")
public class ChiguoguoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChiguoguoServiceApplication.class, args);
	}
}
