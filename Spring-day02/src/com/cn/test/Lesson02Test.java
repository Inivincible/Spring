package com.cn.test;

import com.cn.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zz
 */
public class Lesson02Test {
    private ApplicationContext context;
    @Before
    public void test(){
        context =new ClassPathXmlApplicationContext("beans02.xml");
    }
    @Test
    public void test01(){
        UserService userService = (UserService) context.getBean("userService01");
        userService.add();
    }
    @Test
    public void test02(){
        UserService userService = (UserService) context.getBean("userService02");
        userService.add();
    }

    @Test
    public void test03(){
        UserService userService = (UserService) context.getBean("userService03");
        userService.add();
    }
}
