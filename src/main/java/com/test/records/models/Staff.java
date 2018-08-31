package com.test.records.models;

import com.test.records.models.enumerated.Gender;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.data.annotation.Id;
=======
>>>>>>> master
=======
import org.springframework.data.annotation.Id;
>>>>>>> 4740aa5390d07d14ec90d08cffccef7ef4293545

public class Staff {
    public String staffId;
    public String nationalId;
    public String name;
    @Id
    public String patientId;
    public String id;
    public Gender gender;

    public Staff(String staffId, String nationalId, String name, String patientId, String id, Gender gender) {
        this.staffId = staffId;
        this.name = name;
        this.patientId = patientId;
        this.id = id;
        this.nationalId = nationalId;
        this.gender = gender;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
