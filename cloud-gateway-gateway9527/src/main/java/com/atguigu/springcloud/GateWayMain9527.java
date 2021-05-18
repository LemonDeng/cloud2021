package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName:GateWayMain9527
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/18 15:10
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
     public static void main(String[] args) {
           SpringApplication.run(GateWayMain9527.class, args);
      }

}
