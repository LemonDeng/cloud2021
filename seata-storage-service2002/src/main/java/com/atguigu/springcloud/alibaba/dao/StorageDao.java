package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName:StorageDao
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/28 17:38
 */
@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
