package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PathController {


    @RequestMapping(value = "/fun")
    public String fun(){

        System.out.println("fun方法被调用");
        return "ok";

    }

    @RequestMapping(value = "/fu?")
    public String fun1(){

        System.out.println("fun1 ?方法被调用");
        return "ok";

    }

    @RequestMapping(value = "/fu*")
    public String fun2(){

        System.out.println("fun2 *方法被调用");
        return "ok";

    }

    @RequestMapping(value = "/?/fun")
    public String fun3(){
        System.out.println("fun/?/fun方法被调用");
        return "ok";
    }
    @RequestMapping(value = "/*/fun")
    public String fun4(){
        System.out.println("fun/?/方法被调用");
        return "ok";
    }
    @RequestMapping(value = "/**/fun")
    public String fun5(){
        System.out.println("fun/**/方法被调用");
        return "ok";
    }



}
