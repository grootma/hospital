package com.groot.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author:groot
 * springboot启动类
 * implements CommandLineRunner 并重写run方法 便于Netty的开发
 *
 */
@SpringBootApplication
@MapperScan("com.groot.hospital.web.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
