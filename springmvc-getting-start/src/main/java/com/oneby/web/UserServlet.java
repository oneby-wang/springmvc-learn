package com.oneby.web;

import com.oneby.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName UserServlet
 * @Description TODO
 * @Author Oneby
 * @Date 2021/3/6 15:17
 * @Version 1.0
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 创建 ApplicationContext 对象
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取 ServletContext 对象
        ServletContext servletContext = this.getServletContext();

        //创建 ApplicationContext 对象
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);

        // 从容器中获取 userService 实例
        UserService userService = context.getBean(UserService.class);

        // 调用 userService 对象中的方法
        userService.save();

    }

}
