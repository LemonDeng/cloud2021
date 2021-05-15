package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName:PaymentServiceImpl
 * @Description: 实现类先要来个service注解,service调用payment接口，Service调Dao
 * @Author: Deng Zhi Li
 * @Date: 2021/5/13 15:28
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource//Autowired注解也可以
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
