package com.s_giken.training.webapp.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/error")
public class AppErrorController implements ErrorController {
    @RequestMapping
    public ModelAndView error(HttpServletRequest request, ModelAndView mav) {
        mav.setViewName("error");
        return mav;
    }
}
