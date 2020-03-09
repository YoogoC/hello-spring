package com.example.hellospring.service.impl;

import com.example.hellospring.dao.UmsAdminMapper;
import com.example.hellospring.dto.AdminParam;
import com.example.hellospring.model.UmsAdmin;
import com.example.hellospring.model.UmsAdminExample;
import com.example.hellospring.service.AdminService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by yoogo on 2020-03-09
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private UmsAdminMapper adminMapper;
    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public List<UmsAdmin> listAll() {
        return adminMapper.selectByExample(new UmsAdminExample());
    }

    @Override
    public Integer create(AdminParam adminParam) {
        UmsAdmin admin = new UmsAdmin();
        admin.setEmail(adminParam.getEmail());
        admin.setCreateTime(new Date());
        admin.setIcon(adminParam.getIcon());
        admin.setNickName(adminParam.getNickName());
        admin.setNote(adminParam.getNote());
        admin.setStatus(adminParam.getStatus());
        admin.setUsername(adminParam.getUsername());

        String password = passwordEncoder.encode(String.valueOf(System.currentTimeMillis()));
        admin.setPassword(password);
        return adminMapper.insert(admin);
    }
}
