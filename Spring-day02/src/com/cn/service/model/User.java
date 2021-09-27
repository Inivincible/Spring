package com.cn.service.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author zz
 */
public class User implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String userName;
    private String passWord;

    public void setUserName(String userName) {
        System.out.println("02：赋值属性：张三和123");
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public User() {
        System.out.println("01:实例化……");
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("03:设置Bean的名字:"+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        //从工厂把对象放入容器里
        System.out.println("04:Bean工厂"+beanFactory);
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("06：属性赋值完成……");
    }

    public void myInit(){
        System.out.println("07:自定义的初始化方法……");
    }

    @Override
    public void destroy(){
        System.out.println("09:Bean对象被销毁了……");
    }

    public void myDestroy(){
        System.out.println("10:自定义的销毁方法……");
    }
}
