package com.hyt.demo.service.impl;

import com.hyt.demo.dao.UserDao;
import com.hyt.demo.entity.User;
import com.hyt.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * author:king
 * FileName:UserServiceImpl
 * Date:2021/6/9  10:40
 */
@Service// bean id=“” class=""
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findList() {
        return userDao.findList();
    }

    @Override
    public void save(User user) {
        log.info("添加之前id---{}",user.getId());
        userDao.save(user);
        log.info("添加之后id---{}",user.getId());
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User findByiId(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }
}
