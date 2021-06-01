package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName:OrderNacosMain84
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/27 15:41
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacosMain84 {
     public static void main(String[] args) {
           SpringApplication.run(OrderNacosMain84.class, args);
      }

}
