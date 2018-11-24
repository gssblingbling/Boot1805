package com.blingbling.boot1805.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        System.out.println("武六七啊");
        return "blingbling";
    }
}
