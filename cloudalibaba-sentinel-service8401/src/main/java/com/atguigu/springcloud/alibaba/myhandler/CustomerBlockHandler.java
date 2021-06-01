package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @ClassName:CustomerBlockHandler
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/27 11:33
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(4444,"客户自定义的限流处理信息......CustomerBlockHandler");
    }

}
