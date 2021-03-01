package com.hcb.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class HelloSevice implements IHelloService {

    public String SayHello(String name) {
        return "欢迎来到提供者："+name;
    }
}
