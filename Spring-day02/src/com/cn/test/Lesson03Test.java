package com.cn.test;

import com.cn.service.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Bean的生命周期
 * @author zz
 */
public class Lesson03Test {
    private ApplicationContext context;
    @Before
    public void test(){
        context =new ClassPathXmlApplicationContext("beans03.xml");
    }
    @Test
    public void test01() throws Exception {
        User user = (User) context.getBean("user");
        System.out.println(user);

        //关闭容器
        context.getClass().getMethod("close").invoke(context);

    }
}
