package com.gp.service.impl;

import com.gp.dao.AdminMapper;
import com.gp.model.Admin;
import com.gp.service.AdminService;
import com.gp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class AdminServiceImpl implements AdminService {

    @Override
    public boolean login(String id,String password) {
        SqlSession session = MybatisUtils.getSqlSession();
        Admin admin = session.getMapper(AdminMapper.class).login(id,password);
        MybatisUtils.closeSqlSession(session);
        if (admin.getId().equals(id) && admin.getPassword().equals(password)){
            System.out.println("登录成功!");
            return true;
        }
        return false;
    }

    @Override
    public void register(String id, String password) {
        SqlSession session = MybatisUtils.getSqlSession();
        int result = session.getMapper(AdminMapper.class).register(id,password);
        MybatisUtils.closeSqlSession(session);
        if (result != 1){
            System.out.println("注册失败!");
        }
    }
}
