package com.henry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description 主启动类
 * @author Henry
 * @since 2023-05-15
 */
@SpringBootApplication
//扫描当前模块和引入模块下包
@MapperScan(value = "com.henry.mapper")
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class,args);
    }
}
