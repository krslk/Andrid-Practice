package com.cy.store.d_store_module;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class DStoreModuleApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void getConnect() throws SQLException {
        System.out.println(dataSource.getConnection());
    }


    @Test
    void contextLoads() {
    }

}
