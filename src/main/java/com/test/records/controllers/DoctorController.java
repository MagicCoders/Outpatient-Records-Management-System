package com.test.records.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @RequestMapping("/doctor")
    @ResponseBody
    public String doctor(){
        return "doctor content";
    }

    @RequestMapping("/doctor/history/")
    @ResponseBody
    public String doctorDetails(){
        return "doctor content";
    }

    @RequestMapping(value = "/doctor/{id}")
    @ResponseBody
    public String patientDetails(@PathVariable int id){
        return "patient-details";
    }

    //Add post request and put request methods
}
