package com.test.records.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReceptionController {

    @RequestMapping("/reception")
    @ResponseBody
    public String reception(){
        return "reception";
    }

    //Add post request and put request methods
}
