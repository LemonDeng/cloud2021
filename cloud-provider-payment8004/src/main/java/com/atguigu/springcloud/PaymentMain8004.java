package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:PaymentMain8004
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/15 16:47
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain8004.class, args);
      }

}
