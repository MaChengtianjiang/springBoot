package com.tottimctj.springboot.demo.config;

//全局异常捕捉
//添加注解 @ControllerAdvice
//添加一个方法
//在方法上添加@ExcetionHandler拦截响应异常信息
//如果返回是View- 方法的返回值是ModelAndView
//如果返回的是String或者是Json 需要加上@ResponseBody注释

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String defaultExceptionHandler(HttpServletRequest req, Exception e) {

        //模版引擎
        /*ModelAndView mv =new ModelAndView();
        mv.setViewName(viewName);*/
        System.out.println(req.getQueryString());
        return "对不起，服务器繁忙，请稍后再试";

    }
}
