package com.jesse.my_mall.service;

import com.jesse.my_mall.nosql.mongo.document.MemberReadHistory;

import java.util.List;

/**
 * Created by jesse on 2020/10/27 下午12:27
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}