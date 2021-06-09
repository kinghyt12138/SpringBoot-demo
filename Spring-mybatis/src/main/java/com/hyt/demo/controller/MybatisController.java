package com.hyt.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.constructor.SafeConstructor;

/**
 * author:king
 * FileName:MybatisController
 * Date:2021/6/9  9:59
 */
@Controller
//这里使用这个注解 下面的访问jsp页面不会成功 index被转为了json数据 单显示index
//@RestController
public class MybatisController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("hello")
    @ResponseBody//该注释 在不访问jsp页面时 要加 需要将java数据转为json数据
    public String hello(){
        return "hello world";
    }
}
