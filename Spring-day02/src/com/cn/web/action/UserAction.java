package com.cn.web.action;

import com.cn.service.UserService;
import com.cn.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author zz
 */
@Controller("myUserAction")
public class UserAction {
    @Autowired
    @Qualifier("myUserService")
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

    public void save(User user){
        System.out.println("UserAction save()方法："+user);
        userService.add(user);
    }
}
