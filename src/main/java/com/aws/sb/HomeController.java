package com.aws.sb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public ModelAndView save(@ModelAttribute User user)
    {
        ModelAndView view = new ModelAndView();
        view.setViewName("user-data");
        view.addObject("user",user);
        return view;
    }
    @RequestMapping(value="/nextPage",method=RequestMethod.POST)
    public String end()
    {
        return "justtrying";
    }
}