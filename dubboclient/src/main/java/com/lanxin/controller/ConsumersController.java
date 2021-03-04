package com.lanxin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lanxin.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumersController {

    @Reference(group = "group1")
    private UserService userService;

    @RequestMapping(value = "/test")
    public String test(){
        return userService.say("word");
    }
}
