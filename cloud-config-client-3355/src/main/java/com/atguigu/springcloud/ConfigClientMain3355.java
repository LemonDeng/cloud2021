package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName:ConfigClientMain3355
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/22 12:51
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355 {
     public static void main(String[] args) {
           SpringApplication.run(ConfigClientMain3355.class, args);
      }
}
