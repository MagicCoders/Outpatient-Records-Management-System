package com.test.records.controllers;

import com.test.records.crud.UserRepository;
import com.test.records.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/user")
    @ResponseBody
    public String createUser(@RequestBody User user ){
        userRepository.save(user);

        return "Successful user creation";
    }

    @DeleteMapping("/user")
    @ResponseBody
    public String deleteUser(@RequestBody User user){
        userRepository.delete(user);
        return "Successful user Deletion";
    }
}
