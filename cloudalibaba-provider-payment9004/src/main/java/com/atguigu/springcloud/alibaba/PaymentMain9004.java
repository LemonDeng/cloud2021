package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:PaymentMain9004
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/27 15:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain9004.class, args);
      }

}
