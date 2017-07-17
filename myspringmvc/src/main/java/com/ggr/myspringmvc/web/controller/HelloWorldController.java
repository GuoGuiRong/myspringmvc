package com.ggr.myspringmvc.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by GuiRunning on 2017/7/17.
 */
public class HelloWorldController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("name");
        //ModelAndView对象中包括了要返回的逻辑视图,以及数据模型
        ModelAndView mv = new ModelAndView();
        //设置逻辑视图名称
        mv.setViewName("hello");
        //设置数据模型
        mv.addObject("name", name);

        return mv;
    }
}