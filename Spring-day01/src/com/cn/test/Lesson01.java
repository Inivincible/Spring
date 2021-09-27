package com.cn.test;

import com.cn.service.UserService;
import com.cn.service.lmpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson01 {
    @Test
    public void test01(){
        //传统调用方法
        UserService userService = new UserServiceImpl();
        userService.add();
    }
    @Test
    public void test02(){
        //用Spring容器获取
        //1、加载配置文件
        ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
        //2、从Spring容器中获取userService对象
        UserService userService = (UserService) context.getBean("userService");
        userService.add();

    }
}
