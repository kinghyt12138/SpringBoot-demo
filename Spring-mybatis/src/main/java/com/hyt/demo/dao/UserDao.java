package com.hyt.demo.dao;

import com.hyt.demo.entity.User;

import java.util.List;

/**
 * author:king
 * FileName:UserDao
 * Date:2021/6/9  10:35
 */
public interface UserDao {
//    查所有
    List<User> findList();
//    保存
    void save(User user);
//    修改
    void update(User user);
//    通过id查找
    User findById(Integer id);
//    删除
    void delete(Integer id);
}
