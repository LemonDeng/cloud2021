package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName:PaymentController
 * @Description: Controller->Service->Dao
 * @Author: Deng Zhi Li
 * @Date: 2021/5/13 17:01
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        if (result > 0)
        {
            return new CommonResult(200,"插入数据库成功,serverPort: "+serverPort,payment);
        }else
        {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id)
    {
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("*****插入的结果： "+paymentById);
        if (paymentById != null)
        {
            return new CommonResult(200,"查询成功,serverPort: "+serverPort,paymentById);

        }else
        {
            return new CommonResult(444,"没有对应的记录，查询ID："+id,null);
        }

    }


    @GetMapping(value = "/lb")
    public String getPaymentLB()
    {
        return serverPort;
    }


    @GetMapping("/discovery")
    public Object discovery()
    {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("*****"+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());

        }
        return this.discoveryClient;
    }
}
