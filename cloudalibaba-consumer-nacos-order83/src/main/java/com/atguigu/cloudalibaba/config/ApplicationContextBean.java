package com.atguigu.cloudalibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName:ApplicationContextBean
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/24 11:17
 */
@Configuration
public class ApplicationContextBean {

    @Bean
    @LoadBalanced //负载均衡,Ribbon 默认使用轮训机制
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

}
