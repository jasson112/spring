package com.example.demo02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String, Object> model){
        model.put("message", "HEllo my folk !");
        return "greeting";
    }

    @GetMapping("thyme")
    public String thyme(Map<String, Object> model){
        model.put("message", "HEllo my folk in THYME!");
        return "thyme";
    }
}
