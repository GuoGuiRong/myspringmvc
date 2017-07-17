package com.ggr.myspringmvc.web.controller.interfaces;

import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by GuiRunning on 2017/7/17.
 */
public class MyhandlerAdapter implements HandlerAdapter {
    public boolean supports(Object handler) {
        return (handler instanceof Myhandler);
    }

    public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return ((Myhandler)handler).my_handleRequest(request,response);
    }

    public long getLastModified(HttpServletRequest request, Object handler) {
        return -1;
    }
}
