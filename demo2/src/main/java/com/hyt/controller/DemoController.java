package com.hyt.controller;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:king
 * FileName:DemoController
 * Date:2021/6/8  15:58
 */
@Controller
@RequestMapping("demo2")
//有注解之后 就不需要定义变量logger了 他所给的变量是log
@Slf4j
public class DemoController {


    private static Logger logger = LoggerFactory.getLogger(DemoController.class);
    @RequestMapping("hello")
    @ResponseBody
    public String helloworld(){
        //少采用这种输出方式 使用logger
//        System.out.println("hello world");
        logger.info("hello");
        //使用{}占位 输出时会自动拼接
        logger.debug("hhhe1==={}","hhhh");
        log.debug("hssshh");
        return "hello";
    }
}
