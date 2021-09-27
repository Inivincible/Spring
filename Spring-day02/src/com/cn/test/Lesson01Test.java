package com.cn.test;

import com.cn.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Spring容器加载的3种方式
 * @author zz
 */
public class Lesson01Test {
    /**
     *  第一种ClassPathXmlApplicationContext  ClassPath指定就是class路径
     *   ClassPathXmlApplicationContext是BeanFactory的扩展     及时加载
     */
    @Test
    public void test01() {
        //1、加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");
        //2、从Spring容器中获取userService对象
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

    /**
     *  第二种：文件系统路径获得配置文件(绝对路径)
     */

    @Test
    public void test02() {
        //1、加载配置文件
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\spring-day02\\src\\beans01.xml");
        //2、从Spring容器中获取userService对象
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

    /**
     *  第三种方式：使用BeanFactory(Bean工厂)过时
     *              BeanFactory采取延时加载
     */

    @Test
    public void test03() {
        String path = "D:\\IdeaProjects\\spring-day02\\src\\beans01.xml";
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource(path));
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.add();
    }
}
