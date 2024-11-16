package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();//返回数据库中所有的对象

    User selectById(int id);//通过auth_id查找对应的user信息

    void  addUser(User user);//添加user到数据库中

    void deleteById(int id);//通过auth_id删除对应的user对象

    void  update(User user);//对象信息改变

}
