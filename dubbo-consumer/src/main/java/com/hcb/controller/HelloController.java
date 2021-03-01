package com.hcb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hcb.service.IHelloService;
import com.hcb.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Reference(version = "test")
    IHelloService ihelloService;
    @Resource
    private UserService userService;

    @RequestMapping(value = "/comsumer")
    public String hello(@RequestParam String name){
        return ihelloService.SayHello(name);
    }

    @RequestMapping(value = "/comsumer/setname")
    public String setName(@RequestParam String name){
        return userService.setName(name);
    }
}
