package com.test.records.controllers;

import com.test.records.models.Community;
import com.test.records.models.Staff;
import com.test.records.models.Student;
import com.test.records.models.enumerated.Gender;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QueueController {
    public List<Object> patientQueue = new ArrayList<>();

    public void addToQueue(Object patient){
        patientQueue.add(patient);
    }

    public void removeFromQueue(Object patient){
        patientQueue.remove(patient);
    }

    public Object firstPatient(){
        return patientQueue.get(1);
    }

    public List<Object> getPatientQueue() {
        return patientQueue;
    }
}
