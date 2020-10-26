package com.jesse.my_mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jesse on 2020/10/26 下午2:29
 */
@Configuration
@MapperScan("com.jesse.my_mall.mbg.mapper")
public class MyBatisConfig {
}
