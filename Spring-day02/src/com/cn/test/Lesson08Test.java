package com.cn.test;

import com.cn.service.UserService;
import com.cn.service.impl.UserServiceImpl;
import com.cn.service.model.User;
import com.cn.web.action.UserAction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zz
 */
public class Lesson08Test {
    private ApplicationContext context;

    @Before
    public void test() {
        context = new ClassPathXmlApplicationContext("beans08.xml");
    }

    @Test
    public void test01() {
        //web开发流程action->service->dao

        //1.拿到service
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setUserName("落尘星蕊");
        user.setPassWord("123");
        userService.add(user);

    }

    @Test
    public void test02() {
        //1.拿到action
        UserAction userAction = (UserAction) context.getBean("userAction");
        User user = new User();
        user.setUserName("落尘星蕊");
        user.setPassWord("123");
        userAction.save(user);

    }
}
