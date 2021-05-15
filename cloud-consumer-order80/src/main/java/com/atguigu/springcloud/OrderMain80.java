package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName:OrderMain80
 * @Description: OrderMain80主启动类, Eureka服务注册中心
 * @Author: Deng Zhi Li
 * @Date: 2021/5/13 21:11
 */
@SpringBootApplication
@EnableEurekaClient

public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
