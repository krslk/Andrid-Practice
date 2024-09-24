package com.cy.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cy.store.d_store_module.mapper")
public class DStoreModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DStoreModuleApplication.class, args);
    }

}
