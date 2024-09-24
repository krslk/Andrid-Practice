package com.wms.e_wms_module;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.wms.e_wms_module.mapper")
public class EWmsModuleApplication {
    public static void main(String[] args) {
        SpringApplication.run(EWmsModuleApplication.class, args);
    }
}
