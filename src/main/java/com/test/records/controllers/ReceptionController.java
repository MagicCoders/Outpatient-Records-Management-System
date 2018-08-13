package com.test.records.controllers;

import com.test.records.crud.PatientRepository;
import com.test.records.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Controller
public class ReceptionController {

    @Autowired
    private PatientRepository patientRepository;

    @RequestMapping("/reception")
    @ResponseBody
    public String reception(){
        return "{'aa':'bb'}";
    }

    @PostMapping("/reception")
    public ResponseEntity<Void> createPatientRecord (@RequestBody Patient patient){
        patientRepository.save(patient);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

}
