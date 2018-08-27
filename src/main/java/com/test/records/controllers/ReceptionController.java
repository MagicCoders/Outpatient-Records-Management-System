package com.test.records.controllers;

import com.test.records.crud.CommunityRepository;
import com.test.records.crud.StaffRepository;
import com.test.records.crud.StudentRepository;
import com.test.records.models.Community;
import com.test.records.models.Staff;
import com.test.records.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Controller
public class ReceptionController {

    @Autowired
    private CommunityRepository communityRepository;

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/reception")
    public String reception(){
        return "reception";
    }

    @GetMapping("/reception/{patientType}")
    @ModelAttribute()
    public String renderStudentPage(@PathVariable String patientType, Student student, Staff staff, Community community, Model model){
        switch (patientType){
            case "student":
                model.addAttribute("student", student);
                return "reception/student";
            case "staff":
                model.addAttribute("staff", staff);
                return "reception/staff";
            case "community":
                model.addAttribute("community", community);
                return "reception/community";
            default:
                return "error";
        }
    }

    @PostMapping("/reception/community")
    public String createCommunityRecord (@ModelAttribute Community community){
        communityRepository.save(community);

        return ("redirect:/reception");
    }

    @PostMapping("/reception/staff")
    public String createStaffRecord (@ModelAttribute Staff staff){
        staffRepository.save(staff);

        return ("redirect:/reception");
    }

    @PostMapping("/reception/student")
    public String createStudentRecord (@ModelAttribute Student student){
        studentRepository.save(student);

        return ("redirect:/reception");
    }

}
