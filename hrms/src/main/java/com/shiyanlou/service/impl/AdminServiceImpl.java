package com.shiyanlou.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shiyanlou.dao.AdminDao;
import com.shiyanlou.domain.Admin;
import com.shiyanlou.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    // 自动注入 DAO 对象
    @Resource
    private AdminDao adminDao;

    // 实现接口中的方法    

    @Override
    public Admin login(Admin admin) {

        return adminDao.login(admin);
    }

    @Override
    public List<Admin> findAdmins(Map<String, Object> map) {

        return adminDao.findAdmins(map);
    }

    @Override
    public Integer getCount(Map<String, Object> map) {

        return adminDao.getCount(map);
    }

    @Override
    public Integer addAdmin(Admin admin) {

        return adminDao.addAdmin(admin);
    }

    @Override
    public Integer updateAdmin(Admin admin) {

        return adminDao.updateAdmin(admin);
    }

    @Override
    public Integer deleteAdmin(Integer id) {

        return adminDao.deleteAdmin(id);
    }

}