package com.cn.test;

import com.cn.service.UserService;
import com.cn.service.MyBeanFactory;
import com.cn.service.model.StudentService;
import org.junit.Test;
/**
 * @author zz
 */
public class Lesson01Test {

    @Test
    public void test01() {
      //自用实现AOP编程，使用cglib代理来实现
        UserService userService = MyBeanFactory.createUserService();
        userService.deleteUser();
        userService.deleteUser(82);
        userService.addUser();
        userService.upDateUser();

    }

    @Test
    public void test02() {
        //自用实现AOP编程，使用JDK代理来实现
        StudentService studentService = MyBeanFactory.createStudentService();
        studentService.delete();
        studentService.add();
        studentService.upDate();

    }
}
