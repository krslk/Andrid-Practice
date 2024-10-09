package com.unjt.practice.mysyncdisk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.unjt.practice.mysyncdisk.mapper")
@SpringBootApplication
public class MySyncdiskApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySyncdiskApplication.class, args);
    }

}
