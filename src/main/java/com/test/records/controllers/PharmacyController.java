package com.test.records.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PharmacyController {

    @RequestMapping("/pharmacy")
    @ResponseBody
    public String pharmacy(){
        return "pharmacy";
    }

    @RequestMapping("/pharmacy/{id}")
    @ResponseBody
    public String pharmacyDetails(@PathVariable int id){
        return "pharmacy details";
    }

    //Add post request and put request methods
}
