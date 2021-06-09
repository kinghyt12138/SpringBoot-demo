package com.hyt.demo.controller;

import com.hyt.demo.entity.ParamPojo;
import com.hyt.demo.entity.User;
import com.hyt.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * author:king
 * FileName:UserController
 * Date:2021/6/9  10:43
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("findAll")
    public String findList(HttpServletRequest request, Model model, ModelAndView modelAndView){
        List<User> userList = userService.findList();
        //将结果放入请求作用域
        model.addAttribute("userList",userList);
        return "userList";
    }

    @RequestMapping("Dynamicfind")
    public String Dynamicfind(HttpServletRequest request, Model model, ModelAndView modelAndView){
        ParamPojo paramPojo = new ParamPojo();
//        paramPojo.setName("king");
        paramPojo.setAge(20);
        List<User> userList = userService.Dynamicfind(paramPojo);
        //将结果放入请求作用域
        model.addAttribute("userList",userList);
        return "userList";
    }
    @RequestMapping("save")
    private String save(User user){
        userService.save(user);
        return "redirect:/user/findAll";
    }

    @RequestMapping("update")
    public String update(User user){
        userService.update(user);
        return "redirect:/user/findAll";
    }
    @RequestMapping("findById")
    public String findById(Integer id,Model model){
        User user  = userService.findByiId(id);
        model.addAttribute("userInfo",user);
        return "UserInfo";
    }

    @RequestMapping("delete")
    public String deleteById(Integer id){
        userService.delete(id);
        return "redirect:/user/findAll";
    }
}
