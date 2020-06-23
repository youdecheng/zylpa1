package com.zylpa.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.zylpa")
@MapperScan("com.zylpa.system.mapper")
public class ZylpaAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZylpaAdminApplication.class, args);
	}

}
