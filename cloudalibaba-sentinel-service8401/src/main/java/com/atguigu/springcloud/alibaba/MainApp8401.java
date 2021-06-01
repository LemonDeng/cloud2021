package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:MainApp8401
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/26 21:06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {
     public static void main(String[] args) {
           SpringApplication.run(MainApp8401.class, args);
      }

}
