package com.jesse.my_mall.service;

import com.jesse.my_mall.mbg.model.PmsBrand;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jesse on 2020/10/26 下午1:33
 */

public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
