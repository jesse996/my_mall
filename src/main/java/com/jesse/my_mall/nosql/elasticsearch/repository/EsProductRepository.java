package com.jesse.my_mall.nosql.elasticsearch.repository;

import com.jesse.my_mall.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by jesse on 2020/10/27 上午10:59
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);
}
