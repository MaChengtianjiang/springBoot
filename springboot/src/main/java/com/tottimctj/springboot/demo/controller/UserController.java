package com.tottimctj.springboot.demo.controller;


import com.tottimctj.springboot.demo.bean.User;
import com.tottimctj.springboot.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//RestController = @Controller + @ResponseBody
@RestController
@RequestMapping("/user")
public class UserController<T> {

    @Resource
    private UserService userService;

    @RequestMapping("/save")
    public String save() {
        User user = new User();
        user.setName("jack");
        userService.save(user);
        return "save ok.";
    }

    @RequestMapping("/delete")
    public String delete() {
        userService.delete(1);
        return "delete ok.";
    }


    @RequestMapping("/findByName")
    public User findByName(String name) {
        return userService.findByName(name);
    }

    @RequestMapping("/findByName2")
    public User findByName2(String name) {
        return userService.findByName2(name);
    }

    @RequestMapping("/selectByUserName")
    public User selectByUserName(String name) {
        return userService.selectByUserName(name);
    }



    @RequestMapping("/selectBySql")
    public T selectBySql(String name) {
        String sql = "select * from user where name = ?";
        return (T)userService.selectBySql(sql, new Object[]{name});
    }

    @RequestMapping("/get")
    public Iterable<User> getAll() {
        return userService.getAll();
    }




}
