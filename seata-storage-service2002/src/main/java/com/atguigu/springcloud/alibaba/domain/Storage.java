package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @ClassName:Storage
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/5/28 17:37
 */
@Data
public class Storage {
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;

}
