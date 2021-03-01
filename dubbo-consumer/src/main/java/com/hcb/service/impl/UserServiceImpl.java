package com.hcb.service.impl;

import com.hcb.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public String setName(String name) {
        return "消费者本身提供服务："+name;
    }
}
