package com.test.records.controllers;

import com.test.records.crud.UserRepository;
import com.test.records.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    public String renderLogin(){
        return "login";
    }

    @RequestMapping("/users")
    public String getAllUsers(ModelMap modelMap){
        List<User> allUsers = userRepository.findAll();
        modelMap.put("users", allUsers);
        return "user";
    }

    @RequestMapping("/user/{staffId}")
    public String testUser(ModelMap modelMap, @PathVariable String staffId){
        User user = userRepository.findByStaffId(staffId);
        modelMap.put("user", user);
        return "user-details";
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
