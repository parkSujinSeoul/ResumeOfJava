package com.example.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    @PostMapping("/")
    public String getDefultPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sample");
        return "default";
    }
}
