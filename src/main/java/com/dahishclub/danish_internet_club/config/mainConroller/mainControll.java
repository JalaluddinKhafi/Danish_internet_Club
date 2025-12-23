package com.dahishclub.danish_internet_club.config.mainConroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainControll {

    @GetMapping("/")
    public String mainMap(){
        return "index.html";
    }

    @GetMapping("/index")
    public String indexMap(){
        return "index.html";
    }
    @GetMapping("/users")
    public String UsersMap(){
        return "userPage.html";
    }
}
