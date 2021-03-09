package com.oneby.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @ClassName ContextLoaderListener
 * @Description TODO
 * @Author Oneby
 * @Date 2021/3/6 22:33
 * @Version 1.0
 */
public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        // 获取 ServletContext 对象
        ServletContext servletContext = servletContextEvent.getServletContext();

        // 读取 web.xml 中的全局配置参数
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        // 创建 ApplicationContext 对象
        ApplicationContext context = new ClassPathXmlApplicationContext(contextConfigLocation);

        // 将 ApplicationContext 对象存储到 ServletContext 域中
        WebApplicationContextUtils.setWebApplicationContext(servletContext, context);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
