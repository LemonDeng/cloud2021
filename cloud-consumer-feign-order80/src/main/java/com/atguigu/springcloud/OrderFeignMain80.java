package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName:OrderFeignMain80
 * @Description: TUDOa
 * @Author: Deng Zhi Li
 * @Date: 2021/5/16 20:44
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderFeignMain80.class, args);
      }

}
