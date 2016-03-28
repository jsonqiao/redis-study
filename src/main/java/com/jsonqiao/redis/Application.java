package com.jsonqiao.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by jsonqiao on 2016-03-28.
 */
@EnableCaching
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        Class[] cls = new Class[]{Application.class};
        SpringApplication.run(cls, args);
    }
}
