package com.demo.anger.controller;

import com.demo.anger.domain.User;
import com.demo.anger.exception.config.UserException;
import com.demo.anger.exception.httpCode.UserEorrCode;
import com.demo.anger.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    @GetMapping("/user")
    public User selectByPrimaryKey(Integer id) throws UserException {
        User user = userServiceImp.selectByPrimaryKey(id);
        if(user.getId() == 0){
            throw  new UserException(UserEorrCode.USER_NOT_Live);
        }
        return user;
    }

    @PostMapping("/insert")
    public int insertUser(@RequestParam(value = "id" ,required = true) Integer id, @RequestParam("name") String name, @RequestParam("age") Integer age){
        return userServiceImp.insertUser(id,name,age);
    }


    @GetMapping("/userList")
    public List<User> userList(){
        List<User> userList= userServiceImp.userList();
        return userList;
    }
}
