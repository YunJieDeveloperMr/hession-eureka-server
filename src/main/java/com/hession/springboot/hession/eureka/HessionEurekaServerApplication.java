package com.hession.springboot.hession.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 开启Eureka的注册中心，只需要添加这个注解即可
 */
@EnableEurekaServer
@SpringBootApplication
public class HessionEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HessionEurekaServerApplication.class, args);
    }

}
