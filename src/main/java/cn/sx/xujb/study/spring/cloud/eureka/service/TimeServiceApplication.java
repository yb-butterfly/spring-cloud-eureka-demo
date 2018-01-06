package cn.sx.xujb.study.spring.cloud.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by YB on 2018/1/6.
 */
@SpringBootApplication
@EnableEurekaClient
public class TimeServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TimeServiceApplication.class, args);
    }
}
