package com.cn.service.factory;

import com.cn.service.UserService;
import com.cn.service.impl.UserServiceImpl;
/**
 * 工厂设计模式（静态）
 * @author zz
 */
public class UserServiceFactory01 {
    public static UserService userService() {
        return new UserServiceImpl();
    }
}
