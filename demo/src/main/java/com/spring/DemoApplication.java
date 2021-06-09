package com.spring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * author:king
 * FileName:DemoApplication
 * Date:2021/6/8  15:26
 */
@EnableCaching
//@MapperScan("ltd.ran.mall.dao")
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
