package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 */
@Controller
@RequestMapping("user")
public class HelloController {

    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("hello springmvc");
        return "success";
    }

    @RequestMapping(path="/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("hello springmvc");
        return "success";
    }
}
