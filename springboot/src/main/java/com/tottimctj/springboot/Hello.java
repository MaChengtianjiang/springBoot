package com.tottimctj.springboot;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 测试控制器
 */
@RestController
//@Controller 需要在每个请求方法中加入ResponseBody
@Configuration
public class Hello {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello！";
    }


    //默认使用的json解析框架是jackson
    @RequestMapping("/getDome")
    public DemoBean getDome() {
        DemoBean demo = new DemoBean();
        demo.setId(1);
        demo.setName("jack");
        demo.setDate(new Date());
        return demo;
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2() {
        return "Hello2！";
    }



}

