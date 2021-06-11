package com.hyt.demo.controller;

import com.hyt.demo.entity.User;
import com.hyt.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author:king
 * FileName:ServiceController
 * Date:2021/6/10  10:28
 */
@RestController
@RequestMapping("user2")
public class ServiceController {
    @Autowired
    UserService userService;
    @GetMapping("findAllList")
    public List<User> findList(){
        List<User> userList = userService.findList();
        return userList;
    }

    @PostMapping("save")
    private boolean save(User user){
        userService.save(user);
        return true;
    }

    @GetMapping("findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userService.findByiId(id);
    }

    @PatchMapping("update")
    public boolean update(User user){
        userService.update(user);
        return true;
    }

    @RequestMapping("delete/{id}")
    public boolean deleteById(@PathVariable("id") Integer id){
        userService.delete(id);
        return true;
    }

}
