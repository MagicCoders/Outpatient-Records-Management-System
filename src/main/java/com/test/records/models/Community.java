package com.test.records.models;

import com.test.records.models.enumerated.Gender;
import org.springframework.data.annotation.Id;

public class Community {
    public String nationalId;
    @Id
    public String patientId;
    public String name;
    public Gender gender;

    public Community(String nationalId, String patientId, String name, Gender gender) {
        this.nationalId = nationalId;
        this.patientId = patientId;
        this.name = name;
        this.gender = gender;
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
