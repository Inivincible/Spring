package com.cn.web.action;

import com.cn.service.UserService;
import com.cn.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author zz
 */
//@Controller("myUserAction")

//单例

@Controller
@Scope("prototype")
public class UserAction {
    /**
     * //@Qualifier("myUserService")
     * //@Autowired
     * //等效于前面2行注解
     */
    @Resource(name = "myUserService")
    private UserService userService;

//    public UserService getUserService() {
//        return userService;
//    }
//
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    @Override
    public String toString() {
        return "UserAction{" +
                "userService=" + userService +
                '}';
    }

    public void save(User user) {
        System.out.println("UserAction save()方法：" + user);
        userService.add(user);
    }
}
