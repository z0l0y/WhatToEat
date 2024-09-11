package com.zoloy.whattoeat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zoloy.whattoeat.mapper")
@SpringBootApplication
public class WhatToEatApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatToEatApplication.class, args);
	}

}
