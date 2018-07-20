package com.test.records.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PhysicianController {

    @RequestMapping("/physician")
    @ResponseBody
    public String physician(){
        return "physician object";
    }

    @RequestMapping("/physician/{id}")
    @ResponseBody
    public String physicianDetails(@PathVariable int id ){
        return "physician details object";
    }

    //Add post request and put request methods
}
