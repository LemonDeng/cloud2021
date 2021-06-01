package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @ClassName:AccountDao
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/28 17:58
 */
@Mapper
public interface AccountDao {


    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
