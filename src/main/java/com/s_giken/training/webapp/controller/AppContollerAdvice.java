package com.s_giken.training.webapp.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.ui.Model;

@ControllerAdvice
public class AppContollerAdvice {
    @ExceptionHandler(RuntimeException.class)
    public String handleException(RuntimeException e, Model model) {
        return "error";
    }
}
