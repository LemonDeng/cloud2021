package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:ConfigClientMain3366
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/22 16:11
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
     public static void main(String[] args) {
           SpringApplication.run(ConfigClientMain3366.class, args);
      }

}
