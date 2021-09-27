package com.cn.test;

import com.cn.service.model.Student;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 给对象赋值的方式
 * @author zz
 */
public class Lesson04Test {
    private ApplicationContext context;

    @Before
    public void test() {
        context = new ClassPathXmlApplicationContext("beans04.xml");
    }

    /**
     * 通过构造方法赋值
     */
    @Test
    public void test01() {
        Student student = (Student) context.getBean("student01");
        System.out.println(student);
    }

    @Test
    public void test02() {
        Student student = (Student) context.getBean("student02");
        System.out.println(student);
    }

    @Test
    public void test03() {
        Student student = (Student) context.getBean("student03");
        System.out.println(student);
    }

    @Test
    public void test04() {
        Student student = (Student) context.getBean("student04");
        System.out.println(student);
    }
}
