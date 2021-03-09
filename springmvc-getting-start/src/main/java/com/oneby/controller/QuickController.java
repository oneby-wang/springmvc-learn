package com.oneby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName QuickController
 * @Description TODO
 * @Author Oneby
 * @Date 2021/3/6 23:44
 * @Version 1.0
 */
@Controller
@RequestMapping()
public class QuickController {

    @RequestMapping("/quick")   // 方法映射路径为 /quick
    public String quickMethod() {
        System.out.println("quickMethod running.....");
        // 相当于 "forward:jsp/success.jsp"，以相对路径进行跳转，跳转到 /jsp/success.jsp
        return "success";
    }

}
