package com.cn.service;

import com.cn.service.model.User;

/**
 * @author zz
 */
public interface UserService {
    /**
     * 添加add方法无参
     */
    void add();

    /**
     * 添加add方法代参
     */
    void add(User user);
}
