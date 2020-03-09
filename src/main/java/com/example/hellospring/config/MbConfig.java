package com.example.hellospring.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by yoogo on 2020-03-09
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.example.hellospring.dao"})
public class MbConfig {
}
