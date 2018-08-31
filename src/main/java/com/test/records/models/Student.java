package com.test.records.models;

//Student Model

import com.test.records.models.enumerated.Gender;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.data.annotation.Id;
=======
>>>>>>> master
=======
import org.springframework.data.annotation.Id;
>>>>>>> 4740aa5390d07d14ec90d08cffccef7ef4293545

public class Student {
    private String regNo;
    @Id
    private String patientId;
    private String name;
    private Gender gender;

    public Student(String regNo, String patientId, String name, Gender gender) {
        this.regNo = regNo;
        this.patientId = patientId;
        this.name = name;
        this.gender = gender;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
