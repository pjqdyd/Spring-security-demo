package com.pjqdyd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/userLogin")
    public String login(){
        return "login";
    }

    /**
     * 错误页面
     * @return
     */
    @RequestMapping("/error")
    public String error(){
        return "error";
    }

}
