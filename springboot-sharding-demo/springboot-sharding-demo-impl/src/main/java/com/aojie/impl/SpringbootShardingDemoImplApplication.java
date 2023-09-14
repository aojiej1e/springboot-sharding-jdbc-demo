package com.aojie.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aojie.dal.mapper")
public class SpringbootShardingDemoImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShardingDemoImplApplication.class, args);
    }

}
