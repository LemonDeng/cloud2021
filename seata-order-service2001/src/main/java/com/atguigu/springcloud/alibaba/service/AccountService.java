package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ClassName:AccountService
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/28 16:13
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    /**
     * 扣减金额
     */
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
