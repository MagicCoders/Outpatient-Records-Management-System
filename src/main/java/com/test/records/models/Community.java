package com.test.records.models;

import com.test.records.models.enumerated.Gender;

public class Community {
    public String nationalId;
    public String patientId;
    public String name;
<<<<<<< HEAD
    public Gender gender;

    public Community(String nationalId, String patientId, String name) {
        this.nationalId = nationalId;
=======
 
    public Community(int NationalId, String patientId, String name) {
        this.NationalId = NationalId;
>>>>>>> master
        this.patientId = patientId;
        this.name = name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
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
