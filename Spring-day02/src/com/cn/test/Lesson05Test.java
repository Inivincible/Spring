package com.cn.test;

import com.cn.service.model.Customer;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SpEL表达式
 * @author zz
 */
public class Lesson05Test {
    private ApplicationContext context;

    @Before
    public void test() {
        context = new ClassPathXmlApplicationContext("beans05.xml");
    }

    @Test
    public void test01() throws Exception {
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer+"\n地址:"+customer.getAddress());
    }
}
