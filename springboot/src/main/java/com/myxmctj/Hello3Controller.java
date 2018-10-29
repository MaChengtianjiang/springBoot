package com.myxmctj;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//必须处在SpringApplication相同包下才能被执行
@RestController
public class Hello3Controller {

    @RequestMapping("/hello3")
    public String hello3() {
        return "hello3";

    }
}
