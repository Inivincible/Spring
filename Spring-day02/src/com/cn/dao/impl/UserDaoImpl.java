package com.cn.dao.impl;

import com.cn.dao.UserDao;
import com.cn.service.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author zz
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("dao添加用户："+user);
    }
}
