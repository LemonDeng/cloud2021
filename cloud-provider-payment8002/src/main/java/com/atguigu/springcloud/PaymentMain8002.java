package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Deng Zhi Li
 * @Date 2021/5/12 16:31
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8002 {
    //Eureka服务注册中心
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
