package com.jesse.my_mall.dto;

import lombok.Data;

/**
 * Created by jesse on 2020/10/27 下午5:37
 */
@Data
public class OrderParam {
    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;
}
