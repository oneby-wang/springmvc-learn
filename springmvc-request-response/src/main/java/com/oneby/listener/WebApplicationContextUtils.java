package com.oneby.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @ClassName WebApplicationContextUtils
 * @Description TODO
 * @Author Oneby
 * @Date 2021/3/6 22:33
 * @Version 1.0
 */
public class WebApplicationContextUtils {

    // 将 ApplicationContext 对象设置到 ServletContext 域中
    public static void setWebApplicationContext(ServletContext servletContext, ApplicationContext context) {
        servletContext.setAttribute("app", context);
    }

    // 传入 ServletContext 对象，并从 ServletContext 域中取出 ApplicationContext 对象
    public static ApplicationContext getWebApplicationContext(ServletContext servletContext) {
        return (ApplicationContext) servletContext.getAttribute("app");
    }

}
