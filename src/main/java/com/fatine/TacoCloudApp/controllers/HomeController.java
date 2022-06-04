package com.fatine.TacoCloudApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class HomeController {


    @GetMapping( "/")
    public String home(){
        return "home";
    }


}
