package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//controller控制器
@Controller//相当于配置了一个bean <bean id="HelloController" class="com.atguigu.controller.HelloController"/>
public class HelloController {


    @RequestMapping(value = "/hello")
    public String hello(){

        System.out.println("SpringMVC hellow 程序");

        return "ok";
    }


    @RequestMapping(value = "/params",params = "username=dyz999")
    public String hello1(){

        System.out.println("SpringMVC hellow 程序");

        return "ok";
    }

    @RequestMapping(value = "/params2",params = {"username","password!=4396"})
    public String params(){
        System.out.println("params2被调用");

        return "ok";
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String post(){
        System.out.println("post");

        return "ok";
    }

}
