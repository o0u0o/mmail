package com.o0u0o;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author aiuiot
 * @Date 2020/3/2 2:10 上午
 * @Descripton: 启动类
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.o0u0o.dao")
public class MmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmailApplication.class, args);
    }
}
