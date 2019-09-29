package com.gp.service.impl;

import com.gp.dao.AdminMapper;
import com.gp.model.Admin;
import com.gp.service.AdminService;
import com.gp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class AdminServiceImpl implements AdminService {
    @Override
    public Admin login(String id, String password) throws Exception {
        SqlSession session = MybatisUtils.getSqlSession();
        Admin admin = session.getMapper(AdminMapper.class).login(id,password);
        return admin;
    }

    @Override
    public void register(String id, String password) {
        SqlSession session = MybatisUtils.getSqlSession();
        int result = session.getMapper(AdminMapper.class).register(id,password);
        if (result != 1){
            System.out.println("注册失败!");
        }
    }
}
