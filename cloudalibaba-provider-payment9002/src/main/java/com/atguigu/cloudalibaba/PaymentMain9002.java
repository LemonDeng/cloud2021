package com.atguigu.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:PaymentMain9002
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/24 8:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain9002.class, args);
      }

}
