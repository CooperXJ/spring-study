package com.cooper.mapper;

import com.cooper.pojo.User;

import java.util.List;

public interface UserMapper {
    //存放查询到的用户
    public List<User> selectUser();
}
