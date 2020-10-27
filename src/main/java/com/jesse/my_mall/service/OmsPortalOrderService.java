package com.jesse.my_mall.service;

import com.jesse.my_mall.common.api.CommonResult;
import com.jesse.my_mall.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jesse on 2020/10/27 下午5:35
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
