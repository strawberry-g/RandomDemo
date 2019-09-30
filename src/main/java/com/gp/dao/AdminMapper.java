package com.gp.dao;

import com.gp.model.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    Admin login(@Param("id") String id, @Param("password") String password);

    int register(String id,String password);
}
