package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName:PaymentDao
 * @Description: 和数据库打交道的，接口类型的参数，掉的是数据类型的接口
 * @Author: Deng Zhi Li
 * @Date: 2021/5/13 14:57
 */
//mybatis推荐使用@Mapper注解
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
