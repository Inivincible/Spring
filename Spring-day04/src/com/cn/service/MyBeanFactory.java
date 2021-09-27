package com.cn.service;
import com.cn.service.impl.UserServiceImpl;
import com.cn.service.model.StudentService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 工厂类 JDK实现的代理
 */
public class MyBeanFactory {

    public  static UserService createUserService(){
        //1.创建目标对象target
        final UserServiceImpl userService = new UserServiceImpl();
        //2.声明切面类对象
        final MyAspect myAspect = new MyAspect();
        //3.把切面类的方法应用到目标类中

        //3.1创建JDK的代理

        return (UserService) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
             @Override
             public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                 //开启事务
                 myAspect.before();
                 //方法的返回值是  业务方法的返回值
                 Object invoke = method.invoke(userService, args);
                 System.out.println("invoke:"+invoke);

                 //提交事务
                 myAspect.after();
                 return invoke;
             }
         });
    }


//cglib实现的代理
    public  static StudentService createStudentService(){
        //1.创建目标对象target
        final StudentService studentService = new StudentService();
        //2.声明切面类对象
        final MyAspect myAspect = new MyAspect();
        //3.创建cglib增强对象
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(studentService.getClass());
        //设置回调（与拦截相同）
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspect.before();
                //1.
                Object invoke = method.invoke(studentService, objects);
                //2.
                Object invoke1 = methodProxy.invoke(o, objects);
                myAspect.after();
                return invoke;
            }
        });

        //创建代理对象
`
        return (StudentService) enhancer.create();
    }
}
