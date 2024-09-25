package org.example.spring_demo_0912;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@MapperScan("org.example.spring_demo_0912.Mapper")
@ServletComponentScan
public class SpringDemo0912Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo0912Application.class, args);
	}
}
