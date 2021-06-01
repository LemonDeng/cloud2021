package com.atguigu.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:PaymentMain9001
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/23 22:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9001 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain9001.class, args);
      }

}
