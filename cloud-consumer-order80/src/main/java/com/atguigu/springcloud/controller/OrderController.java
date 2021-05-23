package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:OrderController
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/13 21:46
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {

    public static final String PaymentSrv_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/payment/create")
    public CommonResult create(Payment payment)
    {
        return restTemplate.postForObject(PaymentSrv_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(PaymentSrv_URL+"/payment/getPaymentById/"+id,CommonResult.class);
    }
    // ====================> zipkin+sleuth
    @GetMapping("/payment/zipkin")
    public String paymentZipkin()
    {
        String result = restTemplate.getForObject("http://localhost:8001"+"/payment/zipkin/", String.class);
        return result;
    }

}
