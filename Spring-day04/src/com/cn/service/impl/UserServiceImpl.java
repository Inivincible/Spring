package com.cn.service.impl;

import com.cn.dao.UserDao;
import com.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zz
 *@Component("userService")
 */
@Service("myUserService")
public class UserServiceImpl implements UserService {
    /**
     * spring会自动往userDao赋值
     */
    @Autowired
    private UserDao userDao;
    private String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public UserDao getUserDao() {
//        return userDao;
//    }
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void upDateUser() {
        System.out.println("修改用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }

    @Override
    public int deleteUser(int id) {
        System.out.println("用户今年"+id+"岁！ ");
        return id;
    }
}
