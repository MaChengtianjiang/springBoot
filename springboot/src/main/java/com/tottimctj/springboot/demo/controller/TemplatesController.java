package com.tottimctj.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/templates")
public class TemplatesController {

    // 映射地址是:/templates/hello
    /*@RequestMapping("/hello")
    public String hello() {
        /*  public ModelAndView hello() {
            //正常情况下返回的是ModelAndView对象
                 ModelAndView modelAndView = new ModelAndView("hello");
                return mv;
        return "hello";
    }*/

    // 映射地址是:/templates/hello
    @RequestMapping("/hello")
    public String hello(Map<String,Object> map) {

        map.put("name", "Andy");
        return "hello";
    }
}
