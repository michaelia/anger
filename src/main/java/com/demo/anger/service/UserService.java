package com.demo.anger.service;


import com.demo.anger.domain.User;

public interface UserService {
    //   根据用户id查询信息
    User selectByPrimaryKey(Integer id);
}
