package com.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:king
 * FileName:DemoController
 * Date:2021/6/8  15:05
 */
@Controller
@RequestMapping("demo")
public class DemoController {
    @RequestMapping("helloworld")
    @ResponseBody
    public String helloworld(){
        System.out.println("hello world");
        return  "hello";
    }

    @RequestMapping("index")
//    @ResponseBody
    public String index(){
        System.out.println("index");
        return "index";
    }
}
