package com.test.records.controllers;

import com.test.records.crud.CommunityRepository;
import com.test.records.crud.StaffRepository;
import com.test.records.crud.StudentRepository;
import com.test.records.models.Community;
import com.test.records.models.Staff;
import com.test.records.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;

=======
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

>>>>>>> master
=======
import org.springframework.web.bind.annotation.*;

>>>>>>> 4740aa5390d07d14ec90d08cffccef7ef4293545

@Controller
public class ReceptionController {

    @Autowired
    private CommunityRepository communityRepository;

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private StudentRepository studentRepository;
<<<<<<< HEAD
<<<<<<< HEAD

    @Autowired
    public QueueController queueController;
=======
>>>>>>> master
=======

    @Autowired
    public QueueController queueController;
>>>>>>> 4740aa5390d07d14ec90d08cffccef7ef4293545

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
<<<<<<< HEAD
<<<<<<< HEAD
        queueController.addToQueue(community);
=======
>>>>>>> master
=======
        queueController.addToQueue(community);
>>>>>>> 4740aa5390d07d14ec90d08cffccef7ef4293545

        return ("redirect:/reception");
    }

    @PostMapping("/reception/staff")
    public String createStaffRecord (@ModelAttribute Staff staff){
        staffRepository.save(staff);
<<<<<<< HEAD
<<<<<<< HEAD
        queueController.addToQueue(staff);

=======
>>>>>>> master
=======
        queueController.addToQueue(staff);

>>>>>>> 4740aa5390d07d14ec90d08cffccef7ef4293545

        return ("redirect:/reception");
    }

    @PostMapping("/reception/student")
    public String createStudentRecord (@ModelAttribute Student student){
        studentRepository.save(student);
<<<<<<< HEAD
<<<<<<< HEAD
        queueController.addToQueue(student);
=======
>>>>>>> master
=======
        queueController.addToQueue(student);
>>>>>>> 4740aa5390d07d14ec90d08cffccef7ef4293545

        return ("redirect:/reception");
    }

}
