package com.test.records.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//User controller
@Controller
public class UserController {
    //import CRUD functions
    //Define User routes

    @RequestMapping("/")
    @ResponseBody
    public String testRoute(){
        return "connects successfully";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String testUser(){
        return "Initialize user model and routes";
    }
}
