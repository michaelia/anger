package com.demo.anger.data;



import com.demo.anger.domain.User;

import java.util.List;

public interface UserMapper {

    User selectByPrimaryKey(Integer id);

    int insertUser(Integer id,String name,Integer age);

    List<User> selectAll();
}
