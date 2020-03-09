package com.example.hellospring.controller;

import com.example.hellospring.dto.AdminParam;
import com.example.hellospring.model.UmsAdmin;
import com.example.hellospring.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yoogo on 2020-03-09
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @GetMapping("/listAll")
    public Object adminListAll(){
        List<UmsAdmin> adminList = adminService.listAll();
        Map<String, Object> adminResult = new HashMap();
        adminResult.put("list", adminList);
        return adminResult;
    }

    @PostMapping("/create")
    public Object adminCreate(@RequestBody AdminParam adminParam){
        Integer admin = adminService.create(adminParam);
        Map<String, Object> adminResult = new HashMap();
        adminResult.put("result", admin);
        return adminResult;
    }
}
