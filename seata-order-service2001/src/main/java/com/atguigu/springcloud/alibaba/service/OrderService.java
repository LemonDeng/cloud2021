package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName:OrderService
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/28 16:10
 */
public interface OrderService {

    void create(Order order);


}
