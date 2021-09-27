package com.cn.service.factory;

import com.cn.service.UserService;
import com.cn.service.impl.UserServiceImpl;

/**
 * 工厂设计模式（实例）
 * @author zz
 */

public class UserServiceFactory02 {
    public UserService userService() {
        return new UserServiceImpl();
    }

}
