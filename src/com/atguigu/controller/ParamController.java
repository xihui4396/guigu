package com.atguigu.controller;


import com.atguigu.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ParamController {


    @RequestMapping(value = "param8")
    public String param8(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println(request);
        System.out.println(request.getContextPath());
        System.out.println(request.getParameter("username"));
        System.out.println(response);
        System.out.println(session.getId());
        return "ok";

    }

    @RequestMapping(value = "param1")
    public String param1(String username, String password){

        System.out.println(username+"===========");
        System.out.println(password+"===========");
        return "ok";
    }

    @RequestMapping(value = "param2")
    public String param2(String[] hobby){


        System.out.println(hobby[0]);
        System.out.println(hobby[1]);
        System.out.println(hobby[2]);

        return "ok";
    }
    @RequestMapping(value = "param3")
    public String param3(@RequestParam(name = "user",required =false,defaultValue = "zero")String username){

        System.out.println(username+"====================");
      return "ok";
    }

    @RequestMapping(value = "param4")
    public String param4(@RequestHeader("User-Agent") String UserAgent){

        System.out.println(UserAgent+"===============");
        return "ok";
    }

    @RequestMapping(value = "param5")
    public String param5(@CookieValue("JSESSIONID") String jsessionID ){

        System.out.println(jsessionID+"===============");
        return "ok";
    }

    @RequestMapping(value = "param6")
    public String param6(Person person){

        System.out.println(person+"===============");
        return "ok";
    }



}
