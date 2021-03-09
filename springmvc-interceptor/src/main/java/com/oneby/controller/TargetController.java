package com.oneby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName TargetController
 * @Description TODO
 * @Author Oneby
 * @Date 2021/3/9 10:39
 * @Version 1.0
 */
@Controller
public class TargetController {

    @RequestMapping("/target")
    public ModelAndView show() {
        System.out.println("目标资源执行......");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "Oneby");
        modelAndView.setViewName("forward:/index.jsp");
        return modelAndView;
    }

}
