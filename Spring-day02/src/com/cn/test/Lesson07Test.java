package com.cn.test;

import com.cn.service.UserService;
import com.cn.service.impl.UserServiceImpl;
import com.cn.service.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 注解取代xml注入
 * @author zz
 */
public class Lesson07Test {
    private ApplicationContext context;

    @Before
    public void test() {
        context = new ClassPathXmlApplicationContext("beans07.xml");
    }

    @Test
    public void test01() {
        //如果@Component没有配置id，通过类型获取。
        UserService bean =(UserService)context.getBean(UserServiceImpl.class);
        User user = new User();
        user.setUserName("落尘星蕊");
        bean.add(user);
    }
    @Test
    public void test02() {
        //如果@Component配置id，通过id获取
        UserService bean =(UserService)context.getBean("userService");
        User user = new User();
        user.setUserName("落尘星蕊");
        bean.add(user);
    }
    @Test
    public void test03() {
        //获取接口的class文件
        UserService bean =(UserService)context.getBean(UserService.class);
        User user = new User();
        user.setUserName("落尘星蕊");
        bean.add(user);
    }
}
