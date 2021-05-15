package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:OrderZK80
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/15 18:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZK80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderZK80.class, args);
      }

}
