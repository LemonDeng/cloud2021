package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:NacosConfigClientMain3377
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/24 16:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {

     public static void main(String[] args) {
           SpringApplication.run(NacosConfigClientMain3377.class, args);
      }

}
