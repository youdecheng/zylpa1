package com.zylpa.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.zylpa")
@MapperScan("com.zylpa.system.mapper")
public class ZylpaAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZylpaAdminApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
	}

}
