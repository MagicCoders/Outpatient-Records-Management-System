package com.test.records.controllers;

import com.test.records.crud.UserRepository;
import com.test.records.crud.UserService;
import com.test.records.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
  @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String verifyLogin(@RequestParam String staffId, @RequestParam String password, HttpSession session, Model model){
        User user = userRepository.findByStaffId(staffId);

        if( user != null ){
            //Compare password
            if (user.getPassword().equals(password)){
                session.setAttribute("logged in user", user);
                return "redirect:/";
            }
            model.addAttribute("login error", "error logging in. Please try again");
            return "login";
        }

        model.addAttribute("login error", "error logging in. Please try again");
        return "login";
    }
}
