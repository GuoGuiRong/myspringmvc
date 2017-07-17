package com.ggr.myspringmvc.web.controller.interfaces;


import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by GuiRunning on 2017/7/17.
 */
public class MyController implements Myhandler{
    public ModelAndView my_handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.getModel().put("name","自定义适配器");
        return modelAndView;
    }
}
