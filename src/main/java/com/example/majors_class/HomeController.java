package com.example.majors_class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    MajorRepo majorRepo;
    ClassRepo classRepo;

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }



}
