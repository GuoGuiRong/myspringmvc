package com.ggr.myspringmvc.web.requestMapper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by GuiRunning on 2017/7/17.
 */
@Controller
@RequestMapping(value = {"/url","/URL"})
public class URLController {

    @RequestMapping(value = {"test3","/test4"})
    public String test3( Model model){
        System.out.println(model.toString());
        return "hello";
    }

    @RequestMapping("/test1/{name}")
    public String test(@PathVariable(value = "name") String name, Model model){
        System.out.println(name);
        model.addAttribute("name",name);
        return "hello";
    }

    @RequestMapping("/test2/{name}/path/{id}")
    public String test2(@PathVariable(value = "name") String uname,@PathVariable Long id, Model model){
        System.out.println(uname);
        System.out.println(id);
        model.addAttribute("name",uname);
        return "hello";
    }
}
