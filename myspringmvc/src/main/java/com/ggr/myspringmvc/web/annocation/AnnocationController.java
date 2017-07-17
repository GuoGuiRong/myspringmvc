package com.ggr.myspringmvc.web.annocation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by GuiRunning on 2017/7/17.
 */
@Controller
public class AnnocationController {

    //标准写法是直接创建初始化一个modelandview,内部包含了model和逻辑视图
    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("home");
        mv.getModel().put("home","注解使用");
        return mv;
    }

    //返回逻辑视图的名称
    @RequestMapping("/home1")
    public String home1(Model model){
        model.addAttribute("name","home1跳转");
       return "hello";
    }

    //这种方式会请求转发到一个逻辑视图后会被解析成相应的物理视图
    @RequestMapping("/home3")
    public void home1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("home").forward(request,response);
    }

    //这种方式会请求转发到一个逻辑视图后会被解析成相应的物理视图
    @RequestMapping("/home4")
    public String home4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return "redirect:/test";
    }

    //这种方式会直接包路径当成逻辑视图来解析,前端控制器最后得到的物理视图为WEB-INF/jsp/test.jsp,
    @RequestMapping("/test")
    public void home2(Model model){
        model.addAttribute("name","home1跳转");
    }
}
