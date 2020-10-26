package com.jesse.my_mall.service;

import com.jesse.my_mall.common.api.CommonResult;

/**
 * Created by jesse on 2020/10/26 下午4:40
 */
public interface UmsMemberService {
    public CommonResult generateAuthCode(String telephone);

    public CommonResult verifyAuthCode(String telephone, String authCode);
}
