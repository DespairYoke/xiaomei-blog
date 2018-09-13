package com.xiaomei.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zwd
 * @date 2018/9/13 09:24
 * @Email stephen.zwd@gmail.com
 */
@SpringBootApplication
@MapperScan("com.xiaomei.example.mapper")
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }
}
