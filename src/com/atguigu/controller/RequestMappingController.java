package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value = "/user")
@Controller
public class RequestMappingController {

    @RequestMapping(value = "/hearders", headers = "User-Agent")
    public String headers(){

        System.out.println("headers请求被调用");
        return "ok";

    }

}
