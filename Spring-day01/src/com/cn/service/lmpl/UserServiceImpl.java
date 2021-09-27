package com.cn.service.lmpl;

import com.cn.service.UserService;

public class UserServiceImpl implements UserService {

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

    @Override
    public void add() {
        System.out.println("用户创建:"+name+age+"岁！");
    }
}
