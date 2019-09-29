package com.gp.dao;

import com.gp.model.User;

import java.util.List;

public interface UserMapper {
    User findUserByName(String username);

    User findUserById(String id);

    User findUserByCode(String code);

    void updateCode(String id,boolean state);

    List<User> userList();

    void add(User user);

    void updatePassword(User user);

    void delete(String id);
}
