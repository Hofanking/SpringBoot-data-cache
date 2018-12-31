package com.scorpios.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.scorpios.springboot.mapper")
@SpringBootApplication
@EnableCaching
public class SpringbootDataCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataCacheApplication.class, args);
    }
}
