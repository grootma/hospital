package com.groot.hospital.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String indexHtml(){
        return "index";
    }

}
