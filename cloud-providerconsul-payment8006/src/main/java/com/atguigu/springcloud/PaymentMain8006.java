package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:PaymentMain8006
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/15 19:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain8006.class, args);
      }

}
