package com.dahishclub.danish_internet_club.config.mainConroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainControll {

    @GetMapping(value = "/")
    public  String mainPage(){
        return "index.html";
    }
}
