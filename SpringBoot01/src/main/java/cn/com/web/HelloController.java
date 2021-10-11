package cn.com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zz
 */
@Controller
public class HelloController {
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello,spring boot !";
    }
}
