package com.gp.service;

public interface AdminService {
    boolean login(String id, String password);

    void register(String id,String password);
}
