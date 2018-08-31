package com.test.records.controllers;

import com.test.records.crud.PatientRepository;
import com.test.records.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class PhysicianController {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    public QueueController queueController;

    @RequestMapping("/physician")
    public String physician(ModelMap modelMap){
        Object allPatients = queueController.getPatientQueue();
        modelMap.put("patients", allPatients);
        return "queue";
    }

    @GetMapping("/physician/{patientId}")
    public String  patientDetails(@PathVariable String patientId, ModelMap modelMap ){

        Optional<Patient> patient = patientRepository.findById(patientId);
        if(patient.isPresent() ){
            modelMap.put("patient", patient);
            return "physician";
        }
        else {
            Patient newPatient = new Patient(patientId, null, null, null, null, null, null, null, null, null, null, null);
            patientRepository.save(newPatient);
            modelMap.put("patient", newPatient);
            return "physician";
        }
    }

    @PostMapping("/physician")
    public ResponseEntity<Void> createPatientRecord (@RequestBody Patient patient){
        patientRepository.save(patient);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PostMapping("/physician/{id}")
    public String updatePatientRecord(@PathVariable String id, @ModelAttribute Patient patient){
        Optional<Patient> currentPatient = patientRepository.findById(id);

        if(currentPatient.isPresent()){
            Patient thePatient = currentPatient.get();
            thePatient.setAge(patient.getAge());
            thePatient.setWeight(patient.getWeight());
            thePatient.setHeight(patient.getHeight());

            patientRepository.save(patient);
            return "redirect:/physician";
        }

        return "redirect:/physician";
    }
}
