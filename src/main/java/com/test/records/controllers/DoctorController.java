package com.test.records.controllers;

import com.test.records.crud.PatientRepository;
import com.test.records.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class DoctorController {

    @Autowired
    private PatientRepository patientRepository;

    @RequestMapping("/doctor")
    public String doctor(){
        return "doctor";
    }

    @RequestMapping("/doctor/history/{id}")
    @ResponseBody
    public Optional<Patient> doctorDetails( @PathVariable String id ){
        Optional<Patient> patient = patientRepository.findById(id);
        return patient;
    }

    @RequestMapping("/doctor/{id}")
    @ResponseBody
    public Optional<Patient> patientDetails( @PathVariable String id ){
        Optional<Patient> patient = patientRepository.findById(id);
        return patient;
    }

    @PostMapping("/doctor")
    public ResponseEntity<Void> createPatientRecord (@RequestBody Patient patient){
        patientRepository.save(patient);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/doctor/{id}")
    public ResponseEntity<Patient> updatePatientRecord(@PathVariable String id, @RequestBody Patient patient){
        Optional<Patient> currentPatient = patientRepository.findById(id);

        if(currentPatient.isPresent()){
            Patient thePatient = currentPatient.get();
            thePatient.setTests(patient.getTests());
            thePatient.setDiagnosis(patient.getDiagnosis());
            thePatient.setPrognosis(patient.getPrognosis());

            patientRepository.save(thePatient);
            return new ResponseEntity<Patient>(thePatient, HttpStatus.OK);
        }

        return new ResponseEntity<Patient>(HttpStatus.NOT_FOUND);
    }
}
