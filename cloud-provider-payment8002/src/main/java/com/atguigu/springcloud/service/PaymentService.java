package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName:PaymentService
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/13 15:27
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
