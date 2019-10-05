package cn.itcast.controller;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("testParam")
    public String testParam(String username){
        System.out.println("执行...");
        System.out.println("用户名:"+username);
        return "success";
    }

    @RequestMapping("saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行...");
        System.out.println(account);
//        System.out.println(account.getPassword());
//        System.out.println(account.getMoney());
        return "success";
    }
}
