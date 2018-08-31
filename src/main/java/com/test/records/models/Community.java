package com.test.records.models;

import com.test.records.models.enumerated.Gender;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.data.annotation.Id;

public class Community {
    public String nationalId;
    @Id
    public String patientId;
    public String name;
=======

public class Community {
    public String nationalId;
    public String patientId;
    public String name;
<<<<<<< HEAD
>>>>>>> master
=======
import org.springframework.data.annotation.Id;

public class Community {
    public String nationalId;
    @Id
    public String patientId;
    public String name;
>>>>>>> 4740aa5390d07d14ec90d08cffccef7ef4293545
    public Gender gender;

    public Community(String nationalId, String patientId, String name) {
        this.nationalId = nationalId;
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
 
    public Community(int NationalId, String patientId, String name) {
        this.NationalId = NationalId;
>>>>>>> master
>>>>>>> master
=======
>>>>>>> 4740aa5390d07d14ec90d08cffccef7ef4293545
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
