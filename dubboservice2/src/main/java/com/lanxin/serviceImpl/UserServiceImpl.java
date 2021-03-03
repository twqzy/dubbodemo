package com.lanxin.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lanxin.UserService;
import org.springframework.stereotype.Component;

@Service(timeout = 1000,retries = 2,group = "group2")
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String say(String a) {
        return "你好 "+a;
    }
}
