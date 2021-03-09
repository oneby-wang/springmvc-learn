package com.oneby.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName MyInterceptor1
 * @Description TODO
 * @Author Oneby
 * @Date 2021/3/9 11:03
 * @Version 1.0
 */
public class MyInterceptor1 implements HandlerInterceptor {

    // 在目标方法执行之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle1......");
        // return true 表示放行，return false 不放行
        return true;
    }

    // 在目标方法执行之后视图对象返回之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 修改模型数据
        modelAndView.addObject("name","Heygo");
        System.out.println("postHandle1......");
    }

    // 在流程都执行完毕后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion1......");
    }

}
