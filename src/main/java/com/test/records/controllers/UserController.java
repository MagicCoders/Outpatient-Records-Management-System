package com.test.records.controllers;

import com.test.records.crud.UserRepository;
import com.test.records.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


//User controller
@Controller
public class UserController {
    //import CRUD functions
    //Define User routes
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    @ResponseBody
    public List<User> testRoute(){
        return userRepository.findAll();
    }

    @RequestMapping("/user/{staffId}")
    @ResponseBody
    public User testUser(@PathVariable String staffId){
        return userRepository.findByStaffId(staffId);
    }
}
