package com.cn.test;

import com.cn.service.model.Programmer;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * 集合数组数据注入
 * @author zz
 */
public class Lesson06Test {
    private ApplicationContext context;

    @Before
    public void test() {
        context = new ClassPathXmlApplicationContext("beans06.xml");
    }

    @Test
    public void test01() throws Exception {
        Programmer programmer = (Programmer) context.getBean("programmer");
        System.out.println(programmer.getCars());
        System.out.println(programmer.getPats());
        System.out.println(programmer.getInfos());
        System.out.println(programmer.getMyInfos());
        System.out.println(Arrays.toString(programmer.getMembers()));
    }
}
