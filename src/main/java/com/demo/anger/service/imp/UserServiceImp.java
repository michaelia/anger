package com.demo.anger.service.imp;

import com.demo.anger.data.UserMapper;
import com.demo.anger.domain.User;
import com.demo.anger.exception.config.UserException;
import com.demo.anger.exception.httpCode.UserEorrCode;
import com.demo.anger.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;
    final Logger logger = LoggerFactory.getLogger(getClass());
    public User selectByPrimaryKey(Integer id) throws UserException {
        if(userMapper.selectByPrimaryKey(id) == null){
            throw new UserException(UserEorrCode.USER_NOT_Live);
        }
        return userMapper.selectByPrimaryKey(id);
    }


    public int insertUser(@Param("id") Integer id, @Param("name") String name, @Param("age") Integer age) {
        logger.info("插入{}的id成功",id);
        return userMapper.insertUser(id,name,age);
    }

    public List<User> userList() {
        return userMapper.selectAll();
    }
}
