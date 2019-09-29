package com.gp.dao;

import com.gp.model.Admin;

public interface AdminMapper {
    Admin login(String id, String password);

    int register(String id,String password);
}
