package com.test.records.controllers;

import com.test.records.crud.PatientRepository;
import com.test.records.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class LabController {

    @Autowired
    private PatientRepository patientRepository;

    @RequestMapping("/lab")
    public String RenderLab(){
        return "lab";
    }

    @RequestMapping("/lab/{id}")
    @ResponseBody
    public Optional<Patient> patientDetails(@PathVariable String id ){
        Optional<Patient> patient = patientRepository.findById(id);
        return patient;
    }

    @PostMapping("/lab")
    public ResponseEntity<Void> createPatientRecord (@RequestBody Patient patient){
        patientRepository.save(patient);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/lab/{id}")
    public ResponseEntity<Patient> updatePatientRecord(@PathVariable String id, @RequestBody Patient patient){
        Optional<Patient> currentPatient = patientRepository.findById(id);

        if(currentPatient.isPresent()){
            Patient thePatient = currentPatient.get();
            thePatient.setTests(patient.getTests());

            patientRepository.insert(thePatient);
            return new ResponseEntity<Patient>(thePatient, HttpStatus.OK);
        }

        return new ResponseEntity<Patient>(HttpStatus.NOT_FOUND);
    }
}
