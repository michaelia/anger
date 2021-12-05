package com.demo.anger.service;


import com.demo.anger.domain.User;
import com.demo.anger.exception.config.BaseException;

public interface UserService {
    //   根据用户id查询信息
    User selectByPrimaryKey(Integer id) throws BaseException;
}
