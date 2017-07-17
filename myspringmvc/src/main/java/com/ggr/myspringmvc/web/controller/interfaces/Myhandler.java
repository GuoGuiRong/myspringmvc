package com.ggr.myspringmvc.web.controller.interfaces;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by GuiRunning on 2017/7/17.
 */
public interface Myhandler {
    public ModelAndView my_handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
