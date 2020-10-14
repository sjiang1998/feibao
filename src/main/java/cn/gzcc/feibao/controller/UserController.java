package cn.gzcc.feibao.controller;


import cn.gzcc.feibao.entity.User;
import cn.gzcc.feibao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/doRegister")
    public String register(User user){
        userService.addUser(user);
        return "redirect:/success.html";
    }

    @RequestMapping("/doLogin")
    public String login(HttpSession session){
        String role=(String)session.getAttribute("role");
        if(role.equals("用户"))
            return "redirect:/first.html";
        if(role.equals("快递员"))
            return "redirect:/courier_order.html";
        if(role.equals("管理员"))
            return "redirect:/admin_user.html";
        System.out.println(role);
        return "redirect:/tselect.html";
    }



}
