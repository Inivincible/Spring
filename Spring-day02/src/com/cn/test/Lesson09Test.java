package com.cn.test;

import com.cn.service.UserService;
import com.cn.service.model.User;
import com.cn.web.action.UserAction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zz
 */
public class Lesson09Test {
    private ApplicationContext context;

    @Before
    public void test() {
        context = new ClassPathXmlApplicationContext("beans09.xml");
    }

    @Test
    public void test01() {
        //注解的使用
        //web开发流程action->service->dao

        //1.拿到service
        UserAction userAction =context.getBean(UserAction.class);
        User user = new User();
        user.setUserName("落尘星蕊");
        user.setPassWord("123");
        userAction.save(user);

    }

    @Test
    public void test02() {
        //注解的使用
        //web开发流程action->service->dao

        //1.拿到service
        UserAction userAction = (UserAction) context.getBean("myUserAction");
        User user = new User();
        user.setUserName("落尘星蕊");
        user.setPassWord("123");
        userAction.save(user);

    }
}
