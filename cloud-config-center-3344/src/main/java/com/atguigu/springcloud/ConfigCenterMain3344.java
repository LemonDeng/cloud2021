package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName:ConfigCenterMain3344
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/21 20:34
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
     public static void main(String[] args) {
           SpringApplication.run(ConfigCenterMain3344.class, args);
      }

}
