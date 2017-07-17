package com.ggr.myspringmvc.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by GuiRunning on 2017/7/17.
 */
public class TestController extends AbstractController {
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
       /*
       ModelAndView mv = new ModelAndView("test");
        mv.getModel().put("name","test");
        return mv;

        */

       /*如果希望直接向浏览器写数据*/
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        httpServletResponse.getWriter().write("你好");
        httpServletResponse.getWriter().close();
       return null;
    }
}
