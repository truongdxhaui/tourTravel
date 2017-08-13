package com.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/")
public class test {
	@RequestMapping(value={"/"})
    public String home(){
        return "index";
    }
}
