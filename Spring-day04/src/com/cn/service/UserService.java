package com.cn.service;

import com.cn.service.model.User;

/**
 * @author zz
 */
public interface UserService {

    /**
     * 切面编程
     *
     */
    void addUser();

    /**
     *修改方法
     *
     */
    void upDateUser();

    /**
     * 删除方法
     *
     */
    void deleteUser();

    /**
     * 带参
     * @param id
     * @return
     */
    int deleteUser(int id);
}
