package com.gp.service;

import com.gp.model.Admin;

public interface AdminService {
    Admin login(String id, String password) throws Exception;

    void register(String id,String password);
}
