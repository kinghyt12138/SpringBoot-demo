package com.hyt.demo.service;

import com.hyt.demo.entity.User;

import java.util.List;

/**
 * author:king
 * FileName:UserService
 * Date:2021/6/9  10:40
 */
public interface UserService {
    //    查询所有
    List<User> findList();
    //添加
    void save(User user);
//    修改
    void update(User user);
//    根据id查找用户
    User findByiId(Integer id);
//    通过id删除用户
    void delete(Integer id);
}
