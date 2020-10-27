package com.jesse.my_mall.dao;

import com.jesse.my_mall.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jesse on 2020/10/27 上午10:55
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
