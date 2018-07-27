package com.wwjswly.dubbo.provider.impl;

import com.wwjswly.dubbo.api.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Javaer on 2018/7/27.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi(String name) {
        return "hello " + name + "!";
    }
}
