package com.hyt.demo.controller;
import com.hyt.demo.entity.User;
import com.hyt.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author:king
 * FileName:ViewController
 * Date:2021/6/10  10:27
 */
@Controller
@RequestMapping("view")
public class ViewController {
    @Autowired
    UserService userService;
    @RequestMapping("findAllList")
    public String findList(){
        return "userList";
    }

    @RequestMapping("save")
    private String save(User user){
        return "addUser";
    }

    @RequestMapping("userInfo")
    private String userInfo(User user){
        return "UserInfo";
    }

    @RequestMapping("findAll")
    private String findAll(){
        return "productList";
    }

}
