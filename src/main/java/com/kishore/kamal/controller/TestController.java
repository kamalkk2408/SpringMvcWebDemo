package com.kishore.kamal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

//    @ResponseBody
    @RequestMapping("/ping")
    public String ping(Model model) {
        model.addAttribute("name" , "Kamal");
        return "Welcome";
    }
}
