package com.atguigu.springcloud.alibaba.service;

import org.apache.ibatis.annotations.Param;

/**
 * @ClassName:StorageService
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/28 17:41
 */
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease( Long productId, Integer count);
}
