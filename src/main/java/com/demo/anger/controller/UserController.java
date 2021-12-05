package com.demo.anger.controller;

import com.demo.anger.domain.User;
import com.demo.anger.exception.config.BaseException;
import com.demo.anger.exception.httpCode.UserEorrCode;
import com.demo.anger.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    @GetMapping("/user")
    public User selectByPrimaryKey(Integer id) throws BaseException {
        User user = userServiceImp.selectByPrimaryKey(id);
        if(user.getId() == 0){
            throw  new BaseException(UserEorrCode.USER_NOT_Live);
        }
        return user;
    }

    @PostMapping("/insert")
    public int insertUser(Integer id,String name,Integer age){

        return userServiceImp.insertUser(id,name,age);
    }


    @GetMapping("/userList")
    public List<User> userList(){
        List<User> userList= userServiceImp.userList();
        return userList;
    }
}
