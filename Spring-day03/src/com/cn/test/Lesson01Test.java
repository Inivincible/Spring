package com.cn.test;

import com.cn.service.model.User;
import com.cn.web.action.UserAction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zz
 */
public class Lesson01Test {
    private ApplicationContext context;

    @Before
    public void test() {
        context = new ClassPathXmlApplicationContext("beans01.xml");
    }

    @Test
    public void test01() {
        //注解的使用
        //web开发流程action->service->dao

        //1.拿到service
        UserAction userAction01 =context.getBean(UserAction.class);
        User user = new User();
        user.setUserName("落尘星蕊");
        user.setPassWord("123");
        userAction01.save(user);

        UserAction userAction02 =context.getBean(UserAction.class);

        System.out.println(userAction01);
        System.out.println(userAction02);

    }
}
