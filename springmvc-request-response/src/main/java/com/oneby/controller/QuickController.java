package com.oneby.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oneby.domain.User;
import com.oneby.domain.VO;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

    /**************************** 页面跳转 ****************************/
    @RequestMapping("/quick")
    public String quickMethod() {
        // return "success"; // 自定义视图解析器之后可以这样写
        return "forward:jsp/success.jsp"; // 当然也可以这样写啦
    }

    @RequestMapping("/quick1")
    public ModelAndView quickMethod1() {
        /*
            Model:模型 作用封装数据
            View：视图 作用展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        // 设置模型数据（向 request 域中存储数据）
        modelAndView.addObject("username", "Oneby");
        // 设置视图名称（视图解析器会为我们拼接前后缀）
        modelAndView.setViewName("success");
        // 返回 modelAndView 对象
        return modelAndView;
    }

    @RequestMapping("/quick2")
    public ModelAndView quickMethod2(ModelAndView modelAndView) {
        // 设置模型数据（向 request 域中存储数据）
        modelAndView.addObject("username", "Oneby");
        // 设置视图名称（视图解析器会为我们拼接前后缀）
        modelAndView.setViewName("success");
        // 返回 modelAndView 对象
        return modelAndView;
    }

    @RequestMapping("/quick3")
    public String quickMethod3(HttpServletRequest request) {
        // 向 request 域中存储数据
        request.setAttribute("username", "Oneby");
        // 转发到 success 页面
        return "success";
    }
    /**************************** 页面跳转 ****************************/

    /**************************** 写回数据 ****************************/
    @RequestMapping("/quick4")
    public void quickMethod4(HttpServletResponse response) throws IOException {
        response.getWriter().print("Hello World");
    }

    @RequestMapping("/quick5")
    @ResponseBody
    public String quickMethod5() {
        return "Hello World";
    }

    @RequestMapping("/quick6")
    @ResponseBody
    public String quickMethod6() {
        return "{\"name\":\"Oneby\",\"age\":21}";
    }

    @RequestMapping("/quick7")
    @ResponseBody
    public String quickMethod7() throws JsonProcessingException {
        // 创建 User 对象
        User user = new User();
        user.setUsername("Oneby");
        user.setAge(21);
        // 利用 ObjectMapper 将对象转为 json 字符串
        ObjectMapper objectMapper = new ObjectMapper();
        String resStr = objectMapper.writeValueAsString(user);
        // 将 json 字符串返回
        return resStr;
    }

    @RequestMapping("/quick8")
    @ResponseBody
    public User quickMethod8() {
        // 创建 User 对象
        User user = new User();
        user.setUsername("Oneby");
        user.setAge(21);
        // 返回 User 对象
        return user;
    }
    /**************************** 写回数据 ****************************/

    /**************************** 获取请求参数 ****************************/
    @RequestMapping("/quick9")
    @ResponseBody
    public void quickMethod9(String username, int age) {
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping("/quick10")
    @ResponseBody
    public void quickMethod10(User user) {
        System.out.println(user);
    }

    @RequestMapping("/quick11")
    @ResponseBody
    public void quickMethod11(String[] strs) {
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping("/quick12")
    @ResponseBody
    public void quickMethod12(VO vo) {
        System.out.println(vo);
    }

    @RequestMapping("/quick13")
    @ResponseBody
    public void quickMethod13(@RequestBody List<User> users) {
        System.out.println(users);
    }

    @RequestMapping("/quick14")
    @ResponseBody
    public void quickMethod14(@RequestParam("name") String username) {
        System.out.println(username);
    }

    @RequestMapping("/quick15")
    @ResponseBody
    public void quickMethod15(
            @RequestParam(value = "name", required = false, defaultValue = "Oneby") String username) {
        System.out.println(username);
    }

    @RequestMapping("/quick16/{name}")
    @ResponseBody
    public void quickMethod16(@PathVariable(value = "name") String username) {
        System.out.println(username);
    }
    /**************************** 获取请求参数 ****************************/


    /**************************** 自定义类型转换器 ****************************/
    @RequestMapping("/quick17")
    @ResponseBody
    public void quickMethod17(Date date) {
        System.out.println(date);
    }
    /**************************** 自定义类型转换器 ****************************/

    /**************************** Servlet 相关 API ****************************/
    @RequestMapping("/quick18")
    @ResponseBody
    public void quickMethod18(
            HttpServletRequest request,
            HttpServletResponse response,
            HttpSession session) {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }
    /**************************** Servlet 相关 API ****************************/

    /**************************** 获取请求头 ****************************/
    @RequestMapping("/quick19")
    @ResponseBody
    public void quickMethod19(
            @RequestHeader(value = "User-Agent", required = false) String userAgent) {
        System.out.println(userAgent);
    }

    @RequestMapping("/quick20")
    @ResponseBody
    public void quickMethod20(@CookieValue(value = "JSESSIONID") String jsessionId) {
        System.out.println(jsessionId);
    }
    /**************************** 获取请求头 ****************************/

    /**************************** 文件上传 ****************************/
    @RequestMapping("/quick21")
    @ResponseBody
    public void quickMethod21(String username, MultipartFile uploadFile) throws IOException {
        // 获取用户名
        System.out.println("上传文件的用户为：" + username);
        //获得文件名称
        String originalFilename = uploadFile.getOriginalFilename();
        // 保存文件
        uploadFile.transferTo(new File("D:\\upload\\" + originalFilename));
    }

    @RequestMapping("/quick22")
    @ResponseBody
    public void quickMethod22(String username, MultipartFile[] uploadFiles) throws IOException {
        // 获取用户名
        System.out.println("上传文件的用户为：" + username);
        // 遍历保存文件
        for (MultipartFile multipartFile : uploadFiles) {
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("D:\\upload\\" + originalFilename));
        }
    }
    /**************************** 文件上传 ****************************/

}
