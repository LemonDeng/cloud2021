package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName:OrderDao
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/28 15:49
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     *
     */
    void create(Order order);

    /**
     * 修改订单状态
     */
    void update(@Param("userId") Long userId,@Param("status") Integer status);

}
