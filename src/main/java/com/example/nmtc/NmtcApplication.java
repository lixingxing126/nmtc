package com.example.nmtc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.nmtc.mapper"})
public class NmtcApplication {

    public static void main(String[] args) {
        SpringApplication.run(NmtcApplication.class, args);
    }

}
