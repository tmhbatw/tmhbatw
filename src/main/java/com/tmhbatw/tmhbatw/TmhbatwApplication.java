package com.tmhbatw.tmhbatw;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class TmhbatwApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmhbatwApplication.class, args);
	}

}
