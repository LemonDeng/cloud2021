package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName:HystrixDashboardMain9001
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/18 11:11
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
     public static void main(String[] args) {
           SpringApplication.run(HystrixDashboardMain9001.class, args);
      }

}
