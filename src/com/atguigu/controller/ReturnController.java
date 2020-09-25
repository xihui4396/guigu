package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReturnController {
    @RequestMapping(value = "/return1")
    public String return1(){
        System.out.println("return1");
        return "forward:/pages/ok.jsp";
    }

    @RequestMapping(value = "return2")
    public String return2(){
        System.out.println("return2");
        return "redirect:/pages/ok.jsp";
    }
    @RequestMapping(value = "return3")
    public ModelAndView return3(){
        System.out.println("mv");
        ModelAndView mv = new ModelAndView("redirect:/pages/ok.jsp");
        return mv;
    }

}
