package com.cn.service.impl;

import com.cn.dao.UserDao;
import com.cn.service.UserService;
import com.cn.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
    public void add() {
        System.out.println("用户创建:"+name+age+"岁！");
    }

    @Override
    public void add(User user) {
        System.out.println("UserServiceImpl添加用户"+user);
        userDao.add(user);
    }

    public UserServiceImpl() {
        System.out.println("UserServiceImpl()调用了");
    }
}
