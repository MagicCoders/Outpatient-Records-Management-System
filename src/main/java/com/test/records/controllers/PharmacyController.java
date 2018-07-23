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
public class PharmacyController {

    @Autowired
    private PatientRepository patientRepository;

    @RequestMapping("/pharmacy")
    @ResponseBody
    public String pharmacy(){
        return "pharmacy";
    }

    @RequestMapping("/pharmacy/{id}")
    @ResponseBody
    public Optional<Patient> patientDetails(@PathVariable String id ){
        Optional<Patient> patient = patientRepository.findById(id);
        return patient;
    }

    @PostMapping("/pharmacy")
    public ResponseEntity<Void> createPatientRecord (@RequestBody Patient patient){
        patientRepository.save(patient);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/pharmacy/{id}")
    public ResponseEntity<Patient> updatePatientRecord(@PathVariable String id, @RequestBody Patient patient){
        Optional<Patient> currentPatient = patientRepository.findById(id);

        if(currentPatient.isPresent()){
            Patient thePatient = currentPatient.get();
            thePatient.setPrescription(patient.getPrescription());

            patientRepository.insert(thePatient);
            return new ResponseEntity<Patient>(thePatient, HttpStatus.OK);
        }

        return new ResponseEntity<Patient>(HttpStatus.NOT_FOUND);
    }
}
