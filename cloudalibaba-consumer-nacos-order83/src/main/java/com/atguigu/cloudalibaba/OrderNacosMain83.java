package com.atguigu.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:OrderNacosMain83
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/24 9:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
     public static void main(String[] args) {
           SpringApplication.run(OrderNacosMain83.class, args);
      }

}
