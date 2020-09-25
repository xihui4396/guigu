package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ScopeController {

    @RequestMapping(value = "/requestScope")
    public String requestScope(HttpServletRequest request){
        System.out.println("requestScope()方法调用了");
        request.setAttribute("reqKey1","reqValue1");
        request.setAttribute("reqKey2","reqValue2");
        return "ok";
    }


    @RequestMapping(value = "/sessionScope")
    public String sessionScope(HttpSession session){
        System.out.println("sessionScope()方法调用了");
        session.setAttribute("sessionKey1","sessionValue1");
        session.setAttribute("sessionKey2","sessionValue2");
        return "ok";
    }

    @Autowired
    ServletContext servletContext;

    @RequestMapping(value = "/servletContextScope")
    public String servletContextScope(){
        System.out.println("servletContextScope方法调用");
        servletContext.setAttribute("servletContextKey1","servletContextValue1");
        servletContext.setAttribute("servletContextKey2","servletContextValue2");
        return "ok";

    }

    /*@RequestMapping(value = "/servletContextScope")
    public String servletContextScope(HttpSession session){
        System.out.println(" servletContextScope() 方法调用了 ");

        ServletContext servletContext = session.getServletContext();

        // 往 HttpSession 域中保存数据
        servletContext.setAttribute("servletContextKey1", "servletContextValue1");
        servletContext.setAttribute("servletContextKey2", "servletContextValue2");

        return "ok";
    }*/

    @RequestMapping(value = "/mapToRequest")
    public String mapToRequest(Map<String,Object> map){
        System.out.println(" mapToRequest() 方法调用了 ");

        map.put("mapKey1","mapValue1");
        map.put("mapKey2","mapValue2");

        return "ok";
    }

    @RequestMapping(value = "/modelToRequest")
    public String modelToRequest(Model model){
        System.out.println(" modelToRequest() 方法调用了 ");

        model.addAttribute("modelKey1","modelValue1");
        model.addAttribute("modelKey2","modelValue3");
        return "ok";
    }

    @RequestMapping(value = "/modelMap")
    public String modelMap(ModelMap modelMap){
        System.out.println("modelMap方法被调用");

        modelMap.addAttribute("modelMapKey1","modelMapValue1");
        modelMap.addAttribute("modelMapKey2","modelMapValue2");
        return "ok";

    }





}
