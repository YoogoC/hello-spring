package com.example.hellospring.service;

import com.example.hellospring.dto.AdminParam;
import com.example.hellospring.model.UmsAdmin;

import java.util.List;

/**
 * Created by yoogo on 2020-03-09
 */
public interface AdminService {
    List<UmsAdmin> listAll();

    Integer create(AdminParam adminParam);
}
